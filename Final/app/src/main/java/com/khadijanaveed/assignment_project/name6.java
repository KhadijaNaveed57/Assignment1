package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name6 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name6);
    }

    public void name7(View view) {
        Intent intent = new Intent(name6.this,name7.class);
        startActivity(intent);
    }

    public void name5(View view) {
        Intent intent = new Intent(name6.this,name5.class);
        startActivity(intent);
    }
}