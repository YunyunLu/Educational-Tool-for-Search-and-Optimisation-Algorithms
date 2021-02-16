package com.example.opt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class CAnaActivity extends AppCompatActivity {

    private TextView tv3;

    private String s3 = "---- Variables";
    private PrinterUtil printerUtil3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cana);

        tv3 = findViewById(R.id.textView35);
        printerUtil3 = new PrinterUtil(tv3, s3, 50);
    }

    public void cFuncClick(View v){
        Intent intent = new Intent(CAnaActivity.this, CFuncActivity.class);
        startActivity(intent);
    }
}
