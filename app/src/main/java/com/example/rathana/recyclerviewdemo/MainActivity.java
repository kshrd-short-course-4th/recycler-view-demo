package com.example.rathana.recyclerviewdemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onShowLinearLayout(View view) {
        startActivity(new Intent(this,LinearLayoutManagerActivity.class));
    }

    public void onShowGridLayout(View view) {

    }

    public void onShowStaggeredLayout(View view) {
        
    }
}
