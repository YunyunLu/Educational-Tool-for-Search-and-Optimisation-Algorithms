package com.example.opt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class PointActivity extends AppCompatActivity {

    private TextView textView;
    private String s1 = "---- Need and Variables";
    private PrinterUtil printerUtil1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_point);

        textView = findViewById(R.id.textView26);
        printerUtil1 = new PrinterUtil(textView, s1, 50);
    }

    public void ppAnalyzeClick(View v){
        Intent intent = new Intent(PointActivity.this, PPAnaActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
