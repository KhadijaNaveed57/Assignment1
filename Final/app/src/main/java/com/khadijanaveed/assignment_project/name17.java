package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name17 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name17);
    }

    public void name18(View view) {
        Intent intent = new Intent(name17.this,name18.class);
        startActivity(intent);
    }

    public void name16(View view) {
        Intent intent = new Intent(name17.this,name16.class);
        startActivity(intent);
    }
}