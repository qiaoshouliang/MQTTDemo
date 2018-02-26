package com.qiaoshouliang.mqttdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startService(new Intent(this, MQTTService.class));
        findViewById(R.id.publishBtn).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                MQTTService.publish("CSDN 一口仨馍");
            }
        });
    }
}
