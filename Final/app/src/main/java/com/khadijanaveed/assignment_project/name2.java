package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name2);
    }

    public void name3(View view) {
        Intent intent = new Intent(name2.this,name3.class);
        startActivity(intent);
    }

    public void name1(View view) {
        Intent intent = new Intent(name2.this,name1.class);
        startActivity(intent);
    }
}