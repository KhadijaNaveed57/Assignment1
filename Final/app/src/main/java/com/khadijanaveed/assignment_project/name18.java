package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name18 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name18);
    }

    public void name19(View view) {
        Intent intent = new Intent(name18.this,namee19.class);
        startActivity(intent);
    }

    public void name17(View view) {
        Intent intent = new Intent(name18.this,name17.class);
        startActivity(intent);
    }
}