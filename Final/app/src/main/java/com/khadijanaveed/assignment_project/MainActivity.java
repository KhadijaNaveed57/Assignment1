package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    Timer timer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = findViewById(R.id.bismillah);
        imageView.animate().alpha(0).setDuration(9000);
        MediaPlayer mp = MediaPlayer.create(this,R.raw.bismillah);
        mp.start();
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                Intent intent = new Intent(MainActivity.this,secondPage.class);
                startActivity(intent);
            }
        },9000);
    }
}