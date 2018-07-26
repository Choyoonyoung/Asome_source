package com.example.asome.asome_sourcerequire;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.GridView;

import java.util.ArrayList;

public class TwoFragment extends ListFragment implements  View.OnClickListener {
    GridView gridView;
    Button addBtn;
    ProjectAdapter pa;
    public TwoFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_2, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        gridView = (GridView)view.findViewById(R.id.gridView);
        addBtn = (Button)view.findViewById(R.id.addbtn);

        pa = new ProjectAdapter();
        pa.addItem(new ProjectItem("projectA", "이 프로젝트는 프로젝트 A입니다.이 프로젝트는 프로젝트 A입니다.이 프로젝트는 프로젝트 A입니다."));
        pa.addItem(new ProjectItem("projectA", "이 프로젝트는 프로젝트 A입니다.이 프로젝트는 프로젝트 A입니다.이 프로젝트는 프로젝트 A입니다."));
        pa.addItem(new ProjectItem("projectA", "이 프로젝트는 프로젝트 A입니다.이 프로젝트는 프로젝트 A입니다.이 프로젝트는 프로젝트 A입니다."));
        pa.addItem(new ProjectItem("projectA", "이 프로젝트는 프로젝트 A입니다.이 프로젝트는 프로젝트 A입니다.이 프로젝트는 프로젝트 A입니다."));
        pa.addItem(new ProjectItem("projectA", "이 프로젝트는 프로젝트 A입니다.이 프로젝트는 프로젝트 A입니다.이 프로젝트는 프로젝트 A입니다."));

        gridView.setAdapter(pa);
        pa.notifyDataSetChanged();

        view.findViewById(R.id.addbtn).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

    }

    public class ProjectAdapter extends BaseAdapter {
        ArrayList<ProjectItem> items = new ArrayList<ProjectItem>();
        @Override
        public int getCount() {
            return items.size();
        }

        @Override
        public Object getItem(int position) {
            return items.get(position);
        }

        @Override
        public long getItemId(int position) {
            return position;
        }
        public void addItem(ProjectItem item){
            items.add(item);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
           ProjectItemView view = new ProjectItemView(getContext());

           ProjectItem item = items.get(position);
           view.setTextTitle(item.getTitle());
           view.setTextAbout(item.getAbout());
           return view;

        }
    }
}
