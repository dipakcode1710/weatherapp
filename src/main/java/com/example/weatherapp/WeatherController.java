package com.example.weatherapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WeatherController {

    @Autowired
    private WeatherService weatherService;

    @GetMapping("/")
    public String home() {
        return "index"; // Thymeleaf template name
    }

    @GetMapping("/weather")
    public String getWeather(@RequestParam String cityName, Model model) {
        try {
            WeatherResponse weather = weatherService.getWeatherByCity(cityName);
            model.addAttribute("weather", weather);
            model.addAttribute("cityName", cityName);
        } catch (Exception e) {
            model.addAttribute("error", "Error fetching weather data: " + e.getMessage());
        }
        return "weather"; // Thymeleaf template name
    }
}