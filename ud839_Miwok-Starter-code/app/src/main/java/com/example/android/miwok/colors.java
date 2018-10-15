package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class colors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
        ArrayList<word> num= new ArrayList<word>(){{
            add(new word("red", "lutti",R.mipmap.ic_launcher)); add(new word("green", "otiiko",R.mipmap.ic_launcher));add(new word("brown", "tolookosu",R.mipmap.ic_launcher));add(new word("gray", "oyyisa",R.mipmap.ic_launcher));
            add(new word("black", "temmokka",R.mipmap.ic_launcher)); add(new word("white", "kenekaku",R.mipmap.ic_launcher));add(new word("dusty yellow", "ṭopiisә",R.mipmap.ic_launcher));add(new word("mustard yellow", "chiwiiṭә",R.mipmap.ic_launcher));

        }};
        wordAdapter itemsAdapter = new wordAdapter(this, num,R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
