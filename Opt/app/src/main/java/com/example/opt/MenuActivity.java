package com.example.opt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void needClick(View v){
        Intent intent = new Intent(MenuActivity.this, NeedActivity.class);
        startActivity(intent);
    }

    public void variableClick(View v){
        Intent intent = new Intent(MenuActivity.this, VariableActivity.class);
        startActivity(intent);
    }

    public void constraintsClick(View v){
        Intent intent = new Intent(MenuActivity.this, ContraintsActivity.class);
        startActivity(intent);
    }

    public void functionClick(View v){
        Intent intent = new Intent(MenuActivity.this, FunctionActivity.class);
        startActivity(intent);
    }

    public void boundClick(View v){
        Intent intent = new Intent(MenuActivity.this, BoundActivity.class);
        startActivity(intent);
    }

    public void algorithmClick(View v){
        Intent intent = new Intent(MenuActivity.this, ProblemActivity.class);
        startActivity(intent);
    }
}
