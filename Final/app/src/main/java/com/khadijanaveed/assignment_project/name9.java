package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name9 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name9);
    }

    public void name10(View view) {
        Intent intent = new Intent(name9.this,name10.class);
        startActivity(intent);
    }

    public void name8(View view) {
        Intent intent = new Intent(name9.this,name8.class);
        startActivity(intent);
    }
}