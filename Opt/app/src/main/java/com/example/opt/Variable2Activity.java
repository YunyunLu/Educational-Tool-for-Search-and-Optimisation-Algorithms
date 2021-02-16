package com.example.opt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Variable2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_variable2);
    }

    public void contraintsClick(View v){
        Intent intent = new Intent(Variable2Activity.this, ContraintsActivity.class);
        startActivity(intent);
    }
}
