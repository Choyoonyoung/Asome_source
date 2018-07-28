package com.example.asome.asome_sourcerequire;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.LinearLayout;

public class NewProjectActivity extends AppCompatActivity {
   LinearLayout aboutForm;
   Animation translateDownAnim;
   Button nextBtn,nextBtn2,addBtn,createBtn,detailBtn;
    LinearLayout roleLayout;
    Sub layout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_project);

        aboutForm = (LinearLayout)findViewById(R.id.AboutForm);
        nextBtn = findViewById(R.id.nextbtn);
        nextBtn2 = findViewById(R.id.nextbtn2);
        addBtn = findViewById(R.id.addbtn);
        createBtn = findViewById(R.id.createbtn);
        roleLayout = (LinearLayout)findViewById(R.id.roleLayout);
        detailBtn = findViewById(R.id.detailBtn);
        translateDownAnim =  AnimationUtils.loadAnimation(getApplicationContext(), R.anim.translate_down);
    }



    public void onNextClicked(View view) {
        nextBtn.setVisibility(View.GONE);
        aboutForm.setVisibility(View.VISIBLE);
        aboutForm.startAnimation(translateDownAnim);
        nextBtn2.setVisibility(View.VISIBLE);
    }

    public void onNextClicked2(View view) {
        nextBtn2.setVisibility(View.GONE);
        roleLayout.setVisibility(View.VISIBLE);
        roleLayout.startAnimation(translateDownAnim);
        addBtn.setVisibility(View.VISIBLE);
        createBtn.setVisibility(View.GONE);

    }
    public void addRoleClicked(View view) {
        layout = new Sub(getApplicationContext());
        roleLayout.addView(layout);
        /*여기다가 다이얼로그 이동 부분 추가*/

    }

    public void onCreateClicked(View view) {
        Intent intent = new Intent();
        setResult(RESULT_OK, intent);
        finish();
    }
}
