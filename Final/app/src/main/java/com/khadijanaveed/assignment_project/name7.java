package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name7 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name7);
    }

    public void name8(View view) {
        Intent intent = new Intent(name7.this,name8.class);
        startActivity(intent);
    }

    public void name6(View view) {
        Intent intent = new Intent(name7.this,name6.class);
        startActivity(intent);
    }
}