package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name20 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name20);
    }

    public void name21(View view) {
        Intent intent = new Intent(name20.this,name21.class);
        startActivity(intent);
    }


    public void name19(View view) {
        Intent intent = new Intent(name20.this,namee19.class);
        startActivity(intent);
    }
}