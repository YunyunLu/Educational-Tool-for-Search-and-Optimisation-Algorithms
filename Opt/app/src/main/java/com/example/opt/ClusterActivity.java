package com.example.opt;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ClusterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cluster);
    }

    public void cAnalyseClick(View v){
        Intent intent = new Intent(ClusterActivity.this, CAnaActivity.class);
        startActivity(intent);
    }
}
