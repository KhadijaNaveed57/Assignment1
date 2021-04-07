package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name40 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name40);
    }

    public void name41(View view) {
        Intent intent = new Intent(name40.this,name41.class);
        startActivity(intent);
    }

    public void name39(View view) {
        Intent intent = new Intent(name40.this,name39.class);
        startActivity(intent);
    }
}