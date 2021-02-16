package com.example.opt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;

public class PPAnaActivity extends AppCompatActivity {

    private TextView tv2;
    private TextView link;

    private String s2 = "---- Constraints and objective function";
    private PrinterUtil printerUtil2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ppana);

        tv2 = findViewById(R.id.textView28);
        printerUtil2 = new PrinterUtil(tv2, s2, 50);
        link = findViewById(R.id.textView29);
        link.setText(Html.fromHtml("<a href='https://mathworld.wolfram.com/FrobeniusNorm.html'>where F denotes the Frobeius norm.</a>"));
        link.setMovementMethod(LinkMovementMethod.getInstance());

    }

    public void pKnapClick(View v){
        Intent intent = new Intent(PPAnaActivity.this, KnapsackActivity.class);
        startActivity(intent);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }
}
