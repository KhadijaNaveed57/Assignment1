package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name31 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name31);
    }

    public void name32(View view) {
        Intent intent = new Intent(name31.this,name32.class);
        startActivity(intent);
    }

    public void name30(View view) {
        Intent intent = new Intent(name31.this,name30.class);
        startActivity(intent);
    }
}