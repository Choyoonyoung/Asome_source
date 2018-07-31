package com.example.asome.asome_sourcerequire;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class RoleDetailDialogActivity extends Activity  {
        AutoCompleteTextView testTag;
        TextView showTag;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_role_detail_dialog);


        testTag = findViewById(R.id.test_tag);
        ArrayAdapter<String> Tadapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, USER_TAG);
        testTag.setAdapter(Tadapter);

        showTag = findViewById(R.id.resultUser);
    }


    private static final String[] USER_TAG = new String[] {
            "@조윤영","@김연지","@황은선","@이경연"
    };



    public void onBackClicked(View view) {
        finish();
    }

    public void userUploadClicked(View view) {
        String textTag = testTag.getText().toString();
        String tag =textTag.substring(1,textTag.length());
        showTag.setText(tag);
    }
}
