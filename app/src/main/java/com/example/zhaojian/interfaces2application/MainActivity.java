package com.example.zhaojian.interfaces2application;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.zhaojian.interfaces2application.util.ConfigUtil;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConfigUtil.loadConfig(this);
    }
}
