package com.example.myapplication.utils;

import android.content.Context;

public class Utils {

    private static Context con;

    public static Context getContext() {
        return con;
    }

    public static void setContext(Context context) {
        if(con != null) {
            con = context;
        }
    }
}
