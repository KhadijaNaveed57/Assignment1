package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name8 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name8);
    }

    public void name9(View view) {
        Intent intent = new Intent(name8.this,name9.class);
        startActivity(intent);
    }

    public void name7(View view) {
        Intent intent = new Intent(name8.this,name7.class);
        startActivity(intent);
    }
}