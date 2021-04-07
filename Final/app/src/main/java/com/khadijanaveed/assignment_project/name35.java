package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name35 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name35);
    }

    public void name36(View view) {
        Intent intent = new Intent(name35.this,name36.class);
        startActivity(intent);
    }

    public void name34(View view) {
        Intent intent = new Intent(name35.this,name34.class);
        startActivity(intent);
    }
}