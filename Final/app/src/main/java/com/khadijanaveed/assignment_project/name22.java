package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name22 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name22);
    }

    public void name23(View view) {
        Intent intent = new Intent(name22.this,name23.class);
        startActivity(intent);
    }

    public void name21(View view) {
        Intent intent = new Intent(name22.this,name21.class);
        startActivity(intent);
    }
}