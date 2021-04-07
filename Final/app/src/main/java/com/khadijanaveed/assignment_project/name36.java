package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name36 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name36);
    }

    public void name37(View view) {
        Intent intent = new Intent(name36.this,name37.class);
        startActivity(intent);
    }

    public void name35(View view) {
        Intent intent = new Intent(name36.this,name35.class);
        startActivity(intent);
    }
}