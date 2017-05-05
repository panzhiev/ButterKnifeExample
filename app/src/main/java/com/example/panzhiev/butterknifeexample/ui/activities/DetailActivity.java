package com.example.panzhiev.butterknifeexample.ui.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.panzhiev.butterknifeexample.R;

import butterknife.ButterKnife;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        ButterKnife.bind(this);
    }
}
