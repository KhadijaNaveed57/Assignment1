package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name10 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name10);
    }

    public void name11(View view) {
        Intent intent = new Intent(name10.this,name11.class);
        startActivity(intent);
    }

    public void name9(View view) {
        Intent intent = new Intent(name10.this,name9.class);
        startActivity(intent);
    }
}