package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name37 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name37);
    }

    public void name38(View view) {
        Intent intent = new Intent(name37.this,name38.class);
        startActivity(intent);
    }

    public void name36(View view) {
        Intent intent = new Intent(name37.this,name36.class);
        startActivity(intent);
    }
}