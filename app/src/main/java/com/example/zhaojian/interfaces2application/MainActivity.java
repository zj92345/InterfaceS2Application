package com.example.zhaojian.interfaces2application;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.zhaojian.interfaces2application.service.ServiceInterfaceS2;
import com.example.zhaojian.interfaces2application.util.ConfigUtil;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConfigUtil.loadConfig(this);
        final TextView responseText = (TextView) findViewById(R.id.textView);
        Button buttonStart = (Button) findViewById(R.id.buttonStart);
        buttonStart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

            }
        });
        Button buttonEnd = (Button) findViewById(R.id.buttonEnd);
        buttonEnd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                responseText.setText(ServiceInterfaceS2.sendEndRequest());
            }
        });
    }

    class httpTask implements Runnable{

        @Override
        public void run() {

        }
    }

    Runnable httpTask = new Runnable() {
        @Override
        public void run() {
            // TODO
//            responseText.setText(ServiceInterfaceS2.sendStartRequest());
        }
    };



}
