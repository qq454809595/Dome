package com.example.myapplication;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import com.alibaba.android.arouter.launcher.ARouter;
import com.example.myapplication.adapter.PagerFragmentAdapter;
import com.example.myapplication.fragment.fragment1;
import com.example.myapplication.fragment.fragment2;
import com.example.myapplication.fragment.fragment3;
import com.example.myapplication.fragment.fragment4;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends BaseAcitivity {

    @BindView(R.id.vp)
    ViewPager vp;
    @BindView(R.id.tb)
    TabLayout tabLayout;
    @BindView(R.id.bt)
    Button bt;

    private List<Fragment> list;
    private String imagePath = "https://timgsa.baidu.com/timg?image&quality=80&size=b9999_10000&sec=1594302973634&di=38c3033be56eba77e562e89ebec0d6cc&imgtype=0&src=http%3A%2F%2Fb-ssl.duitang.com%2Fuploads%2Fitem%2F201803%2F15%2F20180315220039_hliyq.thumb.700_0.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        list = new ArrayList<>();
        list.add(new fragment1());
        list.add(new fragment2());
        list.add(new fragment3());
        list.add(new fragment4());
        PagerFragmentAdapter adapter = new PagerFragmentAdapter(getSupportFragmentManager(), list);
        vp.setAdapter(adapter);
        tabLayout.setupWithViewPager(vp);
    }
}
