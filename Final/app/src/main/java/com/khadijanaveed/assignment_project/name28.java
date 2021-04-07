package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name28 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name28);
    }

    public void name29(View view) {
        Intent intent = new Intent(name28.this,name29.class);
        startActivity(intent);
    }

    public void name27(View view) {
        Intent intent = new Intent(name28.this,name27.class);
        startActivity(intent);
    }
}