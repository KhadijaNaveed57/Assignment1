package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name43 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name43);
    }

    public void name44(View view) {
        Intent intent = new Intent(name43.this,name44.class);
        startActivity(intent);
    }

    public void name42(View view) {
        Intent intent = new Intent(name43.this,name42.class);
        startActivity(intent);
    }
}