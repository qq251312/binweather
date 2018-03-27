package com.bin.binweather.gson;

/**
 * Created by 123 on 2018/3/27.
 */

public class AQI {
    public AQICity city;
    public class AQICity{
        public String aqi;
        public String pm25;
    }
}
