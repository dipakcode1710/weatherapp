package com.example.weatherapp;

public class WeatherResponse {
    private Coord coord;
    private Weather[] weather;
    private String base;
    private Main main;
    private int visibility;
    private Wind wind;
    private Clouds clouds; // Added for the "clouds" field in the response
    private int dt;
    private Sys sys;
    private int timezone;
    private int id;
    private String name;
    private int cod;

    // Getters and Setters (ensure all existing getters/setters are updated or added)
    public Coord getCoord() { return coord; }
    public void setCoord(Coord coord) { this.coord = coord; }
    public Weather[] getWeather() { return weather; }
    public void setWeather(Weather[] weather) { this.weather = weather; }
    public String getBase() { return base; }
    public void setBase(String base) { this.base = base; }
    public Main getMain() { return main; }
    public void setMain(Main main) { this.main = main; }
    public int getVisibility() { return visibility; }
    public void setVisibility(int visibility) { this.visibility = visibility; }
    public Wind getWind() { return wind; }
    public void setWind(Wind wind) { this.wind = wind; }
    public Clouds getClouds() { return clouds; }
    public void setClouds(Clouds clouds) { this.clouds = clouds; }
    public int getDt() { return dt; }
    public void setDt(int dt) { this.dt = dt; }
    public Sys getSys() { return sys; }
    public void setSys(Sys sys) { this.sys = sys; }
    public int getTimezone() { return timezone; }
    public void setTimezone(int timezone) { this.timezone = timezone; }
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public int getCod() { return cod; }
    public void setCod(int cod) { this.cod = cod; }

    // Nested classes for the response structure
    public static class Coord {
        private double lon;
        private double lat;

        // Getters and Setters
        public double getLon() { return lon; }
        public void setLon(double lon) { this.lon = lon; }
        public double getLat() { return lat; }
        public void setLat(double lat) { this.lat = lat; }
    }

    public static class Weather {
        private int id;
        private String main;
        private String description;
        private String icon;

        // Getters and Setters
        public int getId() { return id; }
        public void setId(int id) { this.id = id; }
        public String getMain() { return main; }
        public void setMain(String main) { this.main = main; }
        public String getDescription() { return description; }
        public void setDescription(String description) { this.description = description; }
        public String getIcon() { return icon; }
        public void setIcon(String icon) { this.icon = icon; }
    }

    public static class Main {
        private double temp;
        private double feels_like;
        private double temp_min;
        private double temp_max;
        private int pressure;
        private int humidity;
        private int sea_level; // Added for the new field
        private int grnd_level; // Added for the new field

        // Getters and Setters
        public double getTemp() { return temp; }
        public void setTemp(double temp) { this.temp = temp; }
        public double getFeels_like() { return feels_like; }
        public void setFeels_like(double feels_like) { this.feels_like = feels_like; }
        public double getTemp_min() { return temp_min; }
        public void setTemp_min(double temp_min) { this.temp_min = temp_min; }
        public double getTemp_max() { return temp_max; }
        public void setTemp_max(double temp_max) { this.temp_max = temp_max; }
        public int getPressure() { return pressure; }
        public void setPressure(int pressure) { this.pressure = pressure; }
        public int getHumidity() { return humidity; }
        public void setHumidity(int humidity) { this.humidity = humidity; }
        public int getSea_level() { return sea_level; }
        public void setSea_level(int sea_level) { this.sea_level = sea_level; }
        public int getGrnd_level() { return grnd_level; }
        public void setGrnd_level(int grnd_level) { this.grnd_level = grnd_level; }
    }

    public static class Wind {
        private double speed;
        private int deg;
        private double gust;

        // Getters and Setters
        public double getSpeed() { return speed; }
        public void setSpeed(double speed) { this.speed = speed; }
        public int getDeg() { return deg; }
        public void setDeg(int deg) { this.deg = deg; }
        public double getGust() { return gust; }
        public void setGust(double gust) { this.gust = gust; }
    }

    public static class Clouds {
        private int all;

        // Getters and Setters
        public int getAll() { return all; }
        public void setAll(int all) { this.all = all; }
    }

    public static class Sys {
        private int type;
        private int id;
        private String country;
        private int sunrise;
        private int sunset;

        // Getters and Setters
        public int getType() { return type; }
        public void setType(int type) { this.type = type; }
        public int getId() { return id; }
        public void setId(int id) { this.id = id; }
        public String getCountry() { return country; }
        public void setCountry(String country) { this.country = country; }
        public int getSunrise() { return sunrise; }
        public void setSunrise(int sunrise) { this.sunrise = sunrise; }
        public int getSunset() { return sunset; }
        public void setSunset(int sunset) { this.sunset = sunset; }
    }
}