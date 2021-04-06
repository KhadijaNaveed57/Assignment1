package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name3);
    }

    public void name4(View view) {
        Intent intent = new Intent(name3.this,name4.class);
        startActivity(intent);
    }

    public void name2(View view) {
        Intent intent = new Intent(name3.this,name2.class);
        startActivity(intent);
    }
}