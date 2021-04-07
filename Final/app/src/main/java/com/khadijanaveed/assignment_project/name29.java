package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name29 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name29);
    }

    public void name30(View view) {
        Intent intent = new Intent(name29.this,name30.class);
        startActivity(intent);
    }

    public void name28(View view) {
        Intent intent = new Intent(name29.this,name28.class);
        startActivity(intent);
    }
}