package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name15 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name15);
    }

    public void name16(View view) {
        Intent intent = new Intent(name15.this,name16.class);
        startActivity(intent);
    }

    public void name14(View view) {
        Intent intent = new Intent(name15.this,name14.class);
        startActivity(intent);
    }
}