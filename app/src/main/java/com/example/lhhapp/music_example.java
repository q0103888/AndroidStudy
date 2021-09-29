package com.example.lhhapp;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class music_example extends AppCompatActivity {

    Button btn_start, btn_end;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_music);

        btn_start = (Button)findViewById(R.id.btn_start);
        btn_end = (Button)findViewById(R.id.btn_end);

        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startService(new Intent(getApplicationContext(), MusicService.class));
            }
        });

        btn_end.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                stopService(new Intent(getApplicationContext(), MusicService.class));
            }
        });

    }
}
