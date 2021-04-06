package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name16 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name16);
    }

    public void name17(View view) {
        Intent intent = new Intent(name16.this,name17.class);
        startActivity(intent);
    }

    public void name15(View view) {
        Intent intent = new Intent(name16.this,name15.class);
        startActivity(intent);
    }
}