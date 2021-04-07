package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name23 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name23);
    }

    public void name24(View view) {
        Intent intent = new Intent(name23.this,name24.class);
        startActivity(intent);
    }

    public void name22(View view) {
        Intent intent = new Intent(name23.this,name22.class);
        startActivity(intent);
    }
}