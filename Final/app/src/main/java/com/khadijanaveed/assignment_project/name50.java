package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name50 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name50);
    }

    public void name51(View view) {
        Intent intent = new Intent(name50.this,name51.class);
        startActivity(intent);
    }

    public void name49(View view) {
        Intent intent = new Intent(name50.this,name49.class);
        startActivity(intent);
    }
}