package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name12 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name12);
    }

    public void name13(View view) {
        Intent intent = new Intent(name12.this,name13.class);
        startActivity(intent);
    }

    public void name11(View view) {
        Intent intent = new Intent(name12.this,name11.class);
        startActivity(intent);
    }
}