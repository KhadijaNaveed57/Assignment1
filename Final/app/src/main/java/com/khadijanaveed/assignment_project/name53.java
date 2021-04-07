package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name53 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name53);
    }

    public void name54(View view) {
        Intent intent = new Intent(name53.this,name54.class);
        startActivity(intent);
    }

    public void name52(View view) {
        Intent intent = new Intent(name53.this,name52.class);
        startActivity(intent);
    }
}