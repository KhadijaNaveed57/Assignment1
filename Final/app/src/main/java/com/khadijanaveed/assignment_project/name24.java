package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name24 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name24);
    }

    public void name25(View view) {
        Intent intent = new Intent(name24.this,name25.class);
        startActivity(intent);
    }

    public void name23(View view) {
        Intent intent = new Intent(name24.this,name23.class);
        startActivity(intent);
    }
}