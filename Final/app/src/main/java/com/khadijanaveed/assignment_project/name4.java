package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name4 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name4);
    }

    public void name5(View view) {
        Intent intent = new Intent(name4.this,name5.class);
        startActivity(intent);
    }

    public void name3(View view) {
        Intent intent = new Intent(name4.this,name3.class);
        startActivity(intent);
    }
}