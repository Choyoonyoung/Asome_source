package com.example.asome.asome_sourcerequire;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LogInActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
    }

    public void onLoginClicked(View view) {
        Intent intent = new Intent(LogInActivity.this, MainActivity.class);
        startActivity(intent);
    }

    public void MovetoJoinClicked(View view) {
        Intent intent = new Intent(LogInActivity.this, JoinActivity.class);
        startActivity(intent);
    }
}
