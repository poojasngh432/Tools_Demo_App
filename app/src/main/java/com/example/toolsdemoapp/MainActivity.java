package com.example.toolsdemoapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;

import com.example.toolsdemoapp.activity.ActionBarActivity;
import com.example.toolsdemoapp.activity.DialogBoxes;
import com.example.toolsdemoapp.activity.ErrorMessages;
import com.example.toolsdemoapp.activity.LoginActivity;
import com.example.toolsdemoapp.activity.Views;

public class MainActivity extends AppCompatActivity {

    private Button dialogBoxesBtn, errorMessagesBtn, viewsBtn, actionBarButton, mediaBtn, animationsBtn, dataListsBtn, loginBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dialogBoxesBtn = (Button) findViewById(R.id.dialog_boxes_btn);
        errorMessagesBtn = (Button) findViewById(R.id.error_messages_btn);
        viewsBtn = (Button) findViewById(R.id.views_btn);
        actionBarButton = (Button) findViewById(R.id.action_bar_btn);
        mediaBtn = (Button) findViewById(R.id.media_btn);
        animationsBtn = (Button) findViewById(R.id.animations_btn);
        dataListsBtn = (Button) findViewById(R.id.data_lists_btn);
        loginBtn = (Button) findViewById(R.id.login_btn);

        dialogBoxesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, DialogBoxes.class);
                startActivity(intent);
            }
        });
        errorMessagesBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ErrorMessages.class);
                startActivity(intent);
            }
        });
        viewsBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Views.class);
                startActivity(intent);
            }
        });
        actionBarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ActionBarActivity.class);
                startActivity(intent);
            }
        });
        loginBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        });


    }
}
