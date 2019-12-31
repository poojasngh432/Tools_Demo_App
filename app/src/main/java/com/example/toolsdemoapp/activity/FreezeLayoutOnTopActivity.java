package com.example.toolsdemoapp.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import com.example.toolsdemoapp.R;

public class FreezeLayoutOnTopActivity extends AppCompatActivity {

    private LinearLayout filterLayout_ll;
    private ScrollView scrollView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_freeze_layout_on_top);
    }
}
