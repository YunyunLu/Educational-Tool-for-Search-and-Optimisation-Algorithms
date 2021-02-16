package com.example.opt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ContraintsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contraints);
    }

    public void functionClick(View v){
        Intent intent = new Intent(ContraintsActivity.this, FunctionActivity.class);
        startActivity(intent);
    }
}
