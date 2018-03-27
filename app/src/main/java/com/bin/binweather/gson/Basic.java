package com.bin.binweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by 123 on 2018/3/27.
 */

public class Basic {
    @SerializedName("City")
    public String cityName;
    @SerializedName("id")
    public String weatherId;
    public Update update;
    public class Update{
        @SerializedName("loc")
        public String updateTime;
    }

}
