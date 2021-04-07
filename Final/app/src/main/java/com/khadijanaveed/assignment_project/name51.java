package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name51 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name51);
    }

    public void name52(View view) {
        Intent intent = new Intent(name51.this,name52.class);
        startActivity(intent);
    }

    public void name50(View view) {
        Intent intent = new Intent(name51.this,name50.class);
        startActivity(intent);
    }
}