package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name60 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name60);
    }

    public void name61(View view) {
        Intent intent = new Intent(name60.this,name61.class);
        startActivity(intent);
    }

    public void name59(View view) {
        Intent intent = new Intent(name60.this,name59.class);
        startActivity(intent);
    }
}