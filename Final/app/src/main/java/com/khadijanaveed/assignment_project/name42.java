package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name42 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name42);
    }

    public void name43(View view) {
        Intent intent = new Intent(name42.this,name43.class);
        startActivity(intent);
    }

    public void name41(View view) {
        Intent intent = new Intent(name42.this,name41.class);
        startActivity(intent);
    }
}