package com.example.opt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class KnapsackActivity extends AppCompatActivity {

    private TextView tv6;

    private String s6 = "---- Variables";
    private PrinterUtil printerUtil6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_knapsack);

        tv6 = findViewById(R.id.textView43);
        printerUtil6 = new PrinterUtil(tv6, s6, 50);
    }

    public void cCluClick(View v){
        Intent intent = new Intent(KnapsackActivity.this, ClusterActivity.class);
        startActivity(intent);
    }
}
