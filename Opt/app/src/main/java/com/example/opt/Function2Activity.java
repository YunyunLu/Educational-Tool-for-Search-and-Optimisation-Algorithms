package com.example.opt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Function2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_function2);
    }

    public void boundClick(View v){
        Intent intent = new Intent(Function2Activity.this,BoundActivity.class);
        startActivity(intent);
    }
}
