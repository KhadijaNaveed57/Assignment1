package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name26 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name26);
    }

    public void name27(View view) {
        Intent intent = new Intent(name26.this,name27.class);
        startActivity(intent);
    }

    public void name25(View view) {
        Intent intent = new Intent(name26.this,name25.class);
        startActivity(intent);
    }
}