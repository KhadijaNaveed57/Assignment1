package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name30 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name30);
    }

    public void name31(View view) {
        Intent intent = new Intent(name30.this,name31.class);
        startActivity(intent);
    }

    public void name29(View view) {
        Intent intent = new Intent(name30.this,name29.class);
        startActivity(intent);
    }
}