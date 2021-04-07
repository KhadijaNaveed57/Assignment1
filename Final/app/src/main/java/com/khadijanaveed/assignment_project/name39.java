package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name39 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name39);
    }

    public void name40(View view) {
        Intent intent = new Intent(name39.this,name40.class);
        startActivity(intent);
    }

    public void name38(View view) {
        Intent intent = new Intent(name39.this,name38.class);
        startActivity(intent);
    }
}