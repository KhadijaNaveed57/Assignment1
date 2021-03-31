package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView imageView = findViewById(R.id.bismillah);
        imageView.animate().alpha(0).setDuration(9000);
        MediaPlayer mp = MediaPlayer.create(this,R.raw.bismillah);
        mp.start();
    }
}