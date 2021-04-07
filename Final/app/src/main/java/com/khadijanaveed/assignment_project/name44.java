package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name44 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name44);
    }

    public void name45(View view) {
        Intent intent = new Intent(name44.this,name45.class);
        startActivity(intent);
    }

    public void name43(View view) {
        Intent intent = new Intent(name44.this,name43.class);
        startActivity(intent);
    }
}