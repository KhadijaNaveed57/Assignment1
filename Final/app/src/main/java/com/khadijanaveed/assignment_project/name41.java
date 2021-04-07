package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name41 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name41);
    }

    public void name42(View view) {
        Intent intent = new Intent(name41.this,name42.class);
        startActivity(intent);
    }

    public void name40(View view) {
        Intent intent = new Intent(name41.this,name40.class);
        startActivity(intent);
    }
}