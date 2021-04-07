package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name49 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name49);
    }

    public void name50(View view) {
        Intent intent = new Intent(name49.this,name50.class);
        startActivity(intent);
    }

    public void name48(View view) {
        Intent intent = new Intent(name49.this,name48.class);
        startActivity(intent);
    }
}