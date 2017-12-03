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
    TextView responseTextView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ConfigUtil.loadConfig(this);
        responseTextView = (TextView) findViewById(R.id.textView);
        Button buttonStart = (Button) findViewById(R.id.buttonStart);
        buttonStart.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        String response = ServiceInterfaceS2.sendStartRequest();
                        showResponse(response);
                    }
                }).start();
            }
        });
        Button buttonEnd = (Button) findViewById(R.id.buttonEnd);
        buttonEnd.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                new Thread(new Runnable() {
                    @Override
                    public void run() {
                        String response = ServiceInterfaceS2.sendEndRequest();
                        showResponse(response);
                    }
                }).start();
            }
        });
    }

    private void showResponse(final String responseText){
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                responseTextView.setText(responseText);
            }
        });
    }

}
