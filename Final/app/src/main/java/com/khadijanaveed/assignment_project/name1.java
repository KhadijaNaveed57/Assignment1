package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name1);
    }

    public void name2(View view) {
        Intent intent = new Intent(name1.this,name2.class);
        startActivity(intent);
    }
}