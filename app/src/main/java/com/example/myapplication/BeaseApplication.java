package com.example.myapplication;

import android.app.Application;

import com.example.myapplication.utils.Utils;

public class BeaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Utils.setContext(this);

    }
}
