package com.example.opt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BoundActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bound);
    }

    public void problemClick(View v){
        Intent intent = new Intent(BoundActivity.this, ProblemActivity.class);
        startActivity(intent);
    }
}
