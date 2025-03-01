package com.example.weatherapp;

import org.asynchttpclient.AsyncHttpClient;
import org.asynchttpclient.DefaultAsyncHttpClient;
import org.asynchttpclient.Response;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;

import java.util.concurrent.CompletableFuture;

@Service
public class WeatherService {

    private static final String RAPIDAPI_KEY = "955b82113bmsh3f7fecc1517243fp1c27b6jsne3e068e0c8f1"; // Replace with your actual RapidAPI key
    private static final String RAPIDAPI_HOST = "open-weather13.p.rapidapi.com";
    private final ObjectMapper objectMapper = new ObjectMapper().configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

    public WeatherResponse getWeatherByCity(String cityName) throws Exception {
        try (AsyncHttpClient client = new DefaultAsyncHttpClient()) {
            String url = "https://" + RAPIDAPI_HOST + "/city/" + cityName + "/EN";
            CompletableFuture<Response> responseFuture = client.prepare("GET", url)
                    .setHeader("x-rapidapi-key", RAPIDAPI_KEY)
                    .setHeader("x-rapidapi-host", RAPIDAPI_HOST)
                    .execute()
                    .toCompletableFuture();

            Response response = responseFuture.join();
            if (response.getStatusCode() == 200) {
                return objectMapper.readValue(response.getResponseBody(), WeatherResponse.class);
            } else {
                throw new Exception("Failed to fetch weather data. Status code: " + response.getStatusCode());
            }
        }
    }
}