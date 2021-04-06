package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name13 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name13);
    }

    public void name14(View view) {
        Intent intent = new Intent(name13.this,name14.class);
        startActivity(intent);
    }

    public void name12(View view) {
        Intent intent = new Intent(name13.this,name12.class);
        startActivity(intent);
    }
}