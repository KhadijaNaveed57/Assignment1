package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name52 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name52);
    }

    public void name53(View view) {
        Intent intent = new Intent(name52.this,name53.class);
        startActivity(intent);
    }

    public void name51(View view) {
        Intent intent = new Intent(name52.this,name51.class);
        startActivity(intent);
    }
}