package com.example.myapplication;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

import org.greenrobot.eventbus.EventBus;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Main2Activity extends BaseAcitivity {

    @BindView(R.id.button)
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);



    }

    @OnClick(R.id.button)
    public void onViewClicked() {
        EventBus.getDefault().post("真鸡巴烦");
        Toast.makeText(Main2Activity.this,"点了",Toast.LENGTH_SHORT).show();
    }
}
