package com.example.myapplication;

import android.os.Bundle;
import android.os.PersistableBundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.greenrobot.eventbus.EventBus;

import javax.net.ssl.SSLSessionBindingEvent;

public class BaseAcitivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);   
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
