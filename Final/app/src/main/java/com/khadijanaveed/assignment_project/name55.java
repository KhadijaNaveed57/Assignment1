package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name55 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name55);
    }

    public void name56(View view) {
        Intent intent = new Intent(name55.this,name56.class);
        startActivity(intent);
    }

    public void name54(View view) {
        Intent intent = new Intent(name55.this,name54.class);
        startActivity(intent);
    }
}