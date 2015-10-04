package com.mycode.squarebutton;


import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.util.List;

public class ContentAdapter extends BaseAdapter {

    private Context context;
    private List<Content>contents;

    public ContentAdapter(Context context, List<Content> contents) {
        this.context = context;
        this.contents = contents;
    }

    @Override
    public int getCount() {
        return contents.size();
    }

    @Override
    public Object getItem(int position) {
        return contents.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        CustomButton button;

        if(convertView == null){
            button = new CustomButton(context);
            button.setText(contents.get(position).getName());
        }else {
            button = (CustomButton)convertView;
        }
        button.setId(position);

        return button;
    }
}
