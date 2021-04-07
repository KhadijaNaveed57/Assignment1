package com.khadijanaveed.assignment_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class name46 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name46);
    }

    public void name47(View view) {
        Intent intent = new Intent(name46.this,name47.class);
        startActivity(intent);
    }

    public void name45(View view) {
        Intent intent = new Intent(name46.this,name45.class);
        startActivity(intent);
    }
}