package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name27 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name27);
    }

    public void name28(View view) {
        Intent intent = new Intent(name27.this,name28.class);
        startActivity(intent);
    }

    public void name26(View view) {
        Intent intent = new Intent(name27.this,name26.class);
        startActivity(intent);
    }
}