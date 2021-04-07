package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name21 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name21);
    }

    public void name22(View view) {
        Intent intent = new Intent(name21.this,name22.class);
        startActivity(intent);
    }

    public void name20(View view) {
        Intent intent = new Intent(name21.this,name20.class);
        startActivity(intent);
    }
}