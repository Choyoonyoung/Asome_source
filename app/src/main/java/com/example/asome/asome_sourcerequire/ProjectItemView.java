package com.example.asome.asome_sourcerequire;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

public class ProjectItemView extends LinearLayout{
    TextView textTitle, textAbout;
    public ProjectItemView(Context context) {
        super(context);
        init(context);
    }

    public ProjectItemView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }
    public void init(Context context){
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        inflater.inflate(R.layout.project_item, this, true);
        textTitle = (TextView)findViewById(R.id.textTitle);
        textAbout = (TextView)findViewById(R.id.textAbout);
    }

    public void setTextTitle(String title) {
        textTitle.setText(title);
    }

    public void setTextAbout(String about) {
        textAbout.setText(about);
    }
}
