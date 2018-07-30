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
        TextView textView,showTag;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_role_detail_dialog);

        showTag = findViewById(R.id.resultUser);

        final HashTagAutoCompleteTextView textView=(HashTagAutoCompleteTextView) findViewById(R.id.user_tag);

        HashTagSuggestAdapter adapter = new HashTagSuggestAdapter(this, android.R.layout.simple_dropdown_item_1line, USER_TAG);
        adapter.setCusrsorPositionListener(new HashTagSuggestAdapter.CursorPositionListener() {
            @Override
            public int currentCursorPosition() {
                 return textView.getSelectionStart();
            }
         });

        textView.setAdapter(adapter);

        testTag = findViewById(R.id.test_tag);
        ArrayAdapter<String> Tadapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line, USER_TAG);
        testTag.setAdapter(Tadapter);
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
