package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name32 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name32);
    }

    public void name33(View view) {
        Intent intent = new Intent(name32.this,name33.class);
        startActivity(intent);
    }

    public void name31(View view) {
        Intent intent = new Intent(name32.this,name31.class);
        startActivity(intent);
    }
}