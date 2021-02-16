package com.example.opt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.view.View;
import android.widget.TextView;

public class VariableActivity extends AppCompatActivity {

    private TextView variable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_variable);

        variable = findViewById(R.id.textView10);
        variable.setMovementMethod(ScrollingMovementMethod.getInstance());
    }

    public void variable2Click(View v){
        Intent intent = new Intent(VariableActivity.this, Variable2Activity.class);
        startActivity(intent);
    }


}
