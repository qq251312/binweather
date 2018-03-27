package com.bin.binweather.gson;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by 123 on 2018/3/27.
 */

public class Weather {
    public String status;
    public Basic basic;
    public AQI aqi;
    public Now now;
    public Suggestion suggestion;
    @SerializedName("daily_forecast")
    public List<Forecast> forecastList;
}
