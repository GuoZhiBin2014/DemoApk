package com.cambricon.demoapk.activity.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.cambricon.demoapk.R;

public class ShowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
    }
}
