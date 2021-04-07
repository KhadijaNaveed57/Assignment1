package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name61 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name61);
    }

    public void name62(View view) {
        Intent intent = new Intent(name61.this,name62.class);
        startActivity(intent);
    }

    public void name60(View view) {
        Intent intent = new Intent(name61.this,name60.class);
        startActivity(intent);
    }
}