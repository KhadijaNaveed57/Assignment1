package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name34 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name34);
    }

    public void name35(View view) {
        Intent intent = new Intent(name34.this,name35.class);
        startActivity(intent);
    }

    public void name33(View view) {
        Intent intent = new Intent(name34.this,name33.class);
        startActivity(intent);
    }
}