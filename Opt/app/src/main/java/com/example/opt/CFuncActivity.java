package com.example.opt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class CFuncActivity extends AppCompatActivity {


    private TextView tv5;

    private String s5 = "---- Constraints";
    private PrinterUtil printerUtil5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cfunc);


        tv5 = findViewById(R.id.textView41);
        printerUtil5 = new PrinterUtil(tv5, s5, 50);
    }

    public void cConClick(View v){
        Intent intent = new Intent(CFuncActivity.this, ConclusionActivity.class);
        startActivity(intent);
    }
}
