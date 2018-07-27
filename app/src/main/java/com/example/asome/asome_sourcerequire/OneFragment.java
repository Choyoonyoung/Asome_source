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

public class OneFragment extends ListFragment {
    GridView gridView;
    UserAdapter ua;

    public OneFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_1, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        gridView = (GridView)view.findViewById(R.id.gridView);

        ua = new UserAdapter();
        ua.addItem(new UserItem(R.drawable.user,"조윤영","마켓팅부서","yoon980208@naver.com"));
        ua.addItem(new UserItem(R.drawable.user,"이경연","마켓팅부서","yoon980208@naver.com"));
        ua.addItem(new UserItem(R.drawable.user,"김연지","마켓팅부서","yoon980208@naver.com"));
        ua.addItem(new UserItem(R.drawable.user,"황은선","마켓팅부서","yoon980208@naver.com"));
        ua.addItem(new UserItem(R.drawable.user,"조윤영","마켓팅부서","yoon980208@naver.com"));
        ua.addItem(new UserItem(R.drawable.user,"이경연","마켓팅부서","yoon980208@naver.com"));
        ua.addItem(new UserItem(R.drawable.user,"김연지","마켓팅부서","yoon980208@naver.com"));
        ua.addItem(new UserItem(R.drawable.user,"황은선","마켓팅부서","yoon980208@naver.com"));
        ua.addItem(new UserItem(R.drawable.user,"조윤영","마켓팅부서","yoon980208@naver.com"));
        ua.addItem(new UserItem(R.drawable.user,"이경연","마켓팅부서","yoon980208@naver.com"));
        ua.addItem(new UserItem(R.drawable.user,"김연지","마켓팅부서","yoon980208@naver.com"));
        ua.addItem(new UserItem(R.drawable.user,"황은선","마켓팅부서","yoon980208@naver.com"));
        ua.addItem(new UserItem(R.drawable.user,"조윤영","마켓팅부서","yoon980208@naver.com"));
        ua.addItem(new UserItem(R.drawable.user,"이경연","마켓팅부서","yoon980208@naver.com"));
        ua.addItem(new UserItem(R.drawable.user,"김연지","마켓팅부서","yoon980208@naver.com"));
        ua.addItem(new UserItem(R.drawable.user,"황은선","마켓팅부서","yoon980208@naver.com"));

        gridView.setAdapter(ua);
        ua.notifyDataSetChanged();


    }
    class UserAdapter extends BaseAdapter {
        ArrayList<UserItem> items = new ArrayList<UserItem>();
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
        public void addItem(UserItem item){
            items.add(item);
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            UserItemView view = new UserItemView(getContext());

            UserItem item = items.get(position);
            view.setUserName(item.getName());
            view.setUserProfile(item.getResID());
            view.setUserDepartment(item.getDepartment());
            view.setUserEmail(item.getEmail());
            return view;

        }
    }
}
