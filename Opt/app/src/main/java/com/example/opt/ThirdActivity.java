package com.example.opt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ThirdActivity extends AppCompatActivity {

    private TextView textView;
    private PrinterUtil printerUtil;
    private String s = "Well, in fact, \nit's about optimization \nalgorithms...";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third);

        textView = findViewById(R.id.textView3);
        printerUtil = new PrinterUtil(textView, s, 50);
        textView.setMovementMethod(ScrollingMovementMethod.getInstance());
    }

    public void menuClick(View v){
        Intent intent = new Intent(ThirdActivity.this, MenuActivity.class);
        startActivity(intent);
    }

    public void yesClick(View v){
        Intent intent = new Intent(ThirdActivity.this, ProblemActivity.class);
        startActivity(intent);
    }
}
