package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name14 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name14);
    }

    public void name15(View view) {
        Intent intent = new Intent(name14.this,name15.class);
        startActivity(intent);
    }

    public void name13(View view) {
        Intent intent = new Intent(name14.this,name13.class);
        startActivity(intent);
    }
}