package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name33 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name33);
    }

    public void name34(View view) {
        Intent intent = new Intent(name33.this,name34.class);
        startActivity(intent);
    }

    public void name32(View view) {
        Intent intent = new Intent(name33.this,name32.class);
        startActivity(intent);
    }
}