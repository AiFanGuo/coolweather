package com.coolweather.android.gson;

import android.app.Fragment;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by AnDe on 2017/4/21.
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
