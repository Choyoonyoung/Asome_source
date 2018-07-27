package com.example.asome.asome_sourcerequire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class JoinActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join);
    }

    public void onJoinClicked(View view) {
        Intent intent = new Intent(JoinActivity.this, LogInActivity.class);
        startActivity(intent);
    }
}
