package com.example.opt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

public class ProblemActivity extends AppCompatActivity {

    private TextView textView;
    private String s = "Exactly, it's about practical application of optimization algorithms. Here are some problems...";
    private PrinterUtil printerUtil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problem);

        textView = findViewById(R.id.textView21);
        printerUtil = new PrinterUtil(textView, s, 50);
        textView.setMovementMethod(ScrollingMovementMethod.getInstance());
    }

    public void pointClick(View v){
        Intent intent = new Intent(ProblemActivity.this, PointActivity.class);
        startActivity(intent);
    }

    public void clusterClick(View v){
        Intent intent = new Intent(ProblemActivity.this, ClusterActivity.class);
        startActivity(intent);
    }

    public void knapsackClick(View v){
        Intent intent = new Intent(ProblemActivity.this, KnapsackActivity.class);
        startActivity(intent);
    }
}
