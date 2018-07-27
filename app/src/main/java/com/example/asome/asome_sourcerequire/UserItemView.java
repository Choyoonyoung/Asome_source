package com.example.asome.asome_sourcerequire;

import android.content.Context;
import android.support.annotation.Nullable;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

class UserItemView extends LinearLayout{
    ImageView userProfile;
    TextView userName;
    TextView userDepartment;
    TextView userEmail;

    public UserItemView(Context context) {
        super(context);
        init(context);
    }
    public UserItemView(Context context, AttributeSet attrs){
        super(context, attrs);
        init(context);

    }
    public void init(Context context){
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.user_item, this, true);

        userProfile = (ImageView)findViewById(R.id.imageView);
        userName = (TextView)findViewById(R.id.name);
        userDepartment = (TextView)findViewById(R.id.department);
        userEmail = (TextView)findViewById(R.id.email);
    }

    public void setUserProfile(int resID) {
       userProfile.setImageResource(resID);
    }

    public void setUserName(String name) {
        userName.setText(name);
    }

    public void setUserDepartment(String department) {
        userDepartment.setText(department);
    }

    public void setUserEmail(String email) {
        userEmail.setText(email);
    }
}
