package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name11 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name11);
    }

    public void name12(View view) {
        Intent intent = new Intent(name11.this,name12.class);
        startActivity(intent);
    }

    public void name10(View view) {
        Intent intent = new Intent(name11.this,name10.class);
        startActivity(intent);
    }
}