package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name5 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name5);
    }

    public void name6(View view) {
        Intent intent = new Intent(name5.this,name6.class);
        startActivity(intent);
    }

    public void name4(View view) {
        Intent intent = new Intent(name5.this,name4.class);
        startActivity(intent);
    }
}