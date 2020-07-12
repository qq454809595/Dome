package com.example.myapplication.fragment;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.myapplication.R;
import com.example.myapplication.utils.Utils;

public class fragment1 extends Fragment {
    private boolean isCreateView = false;
    private boolean isVisibleToUser = false;
    private boolean isDataLoad = false;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i("---------------","fragment1    onCreateView1");
        return inflater.inflate(R.layout.fragment1,null);
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        super.setUserVisibleHint(isVisibleToUser);
        Log.i("---------------","fragment1"+isVisibleToUser);
        this.isVisibleToUser = isVisibleToUser;
        lazyLoadData();
    }

    /**
     * 懒加载方法
     */
    public void lazyLoadData(){

    }

}
