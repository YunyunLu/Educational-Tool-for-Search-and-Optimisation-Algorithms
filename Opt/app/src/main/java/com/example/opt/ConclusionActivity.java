package com.example.opt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

public class ConclusionActivity extends AppCompatActivity {

    private TextView conclusion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conclusion);
        conclusion = findViewById(R.id.textView48);
        conclusion.setMovementMethod(ScrollingMovementMethod.getInstance());
    }

    public void startClick(View v){
        Intent intent = new Intent(ConclusionActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
