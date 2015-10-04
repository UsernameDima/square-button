package com.mycode.squarebutton;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Content> contents = new ArrayList<Content>();
        for(int i =0; i<10;i++) {
            contents.add(new Content("content " + i, 10 + i));
        }
        GridView gridView = (GridView)findViewById(R.id.gridView);
        gridView.setAdapter(new ContentAdapter(this,contents));

    }


}
