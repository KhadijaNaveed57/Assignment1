package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name25 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name25);
    }

    public void name26(View view) {
        Intent intent = new Intent(name25.this,name26.class);
        startActivity(intent);
    }

    public void name24(View view) {
        Intent intent = new Intent(name25.this,name24.class);
        startActivity(intent);
    }
}