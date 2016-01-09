package com.example.receiveweather;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button button_shortWeather;
    Button button_longWeather;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button_shortWeather = (Button)findViewById(R.id.main_shortWeather);
        button_longWeather = (Button)findViewById(R.id.main_longWeather);

        button_shortWeather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), ShortWeatherActivity.class);
                startActivity(intent);
            }
        });

        button_longWeather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), LongWeatherActivity.class);
                startActivity(intent);
            }
        });

    }
}
