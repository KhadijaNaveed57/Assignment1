package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class namee19 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_namee19);
    }

    public void name20(View view) {
        Intent intent = new Intent(namee19.this,name20.class);
        startActivity(intent);
    }

    public void name18(View view) {
        Intent intent = new Intent(namee19.this,name18.class);
        startActivity(intent);
    }
}