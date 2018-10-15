package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class numbers extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);
   //     String[] num={"one","two","three","four","five","six","seve","eight","nine","ten"};
        ArrayList<word> num= new ArrayList<word>(){{
            add(new word("one", "lutti",R.mipmap.ic_launcher)); add(new word("two", "otiiko",R.mipmap.ic_launcher));add(new word("three", "tolookosu",R.mipmap.ic_launcher));add(new word("four", "oyyisa",R.mipmap.ic_launcher));add(new word("five", "massokka",R.mipmap.ic_launcher));
            add(new word("six", "temmokka",R.mipmap.ic_launcher)); add(new word("seven", "kenekaku",R.mipmap.ic_launcher));add(new word("eight", "kawinta",R.mipmap.ic_launcher));add(new word("nine", "wo'e",R.mipmap.ic_launcher));add(new word("ten", "na’aacha",R.mipmap.ic_launcher));

        }};
        Log.v("numbers","word at list[0]"+num.get(0));
        Log.v("numbers","word at list[1]"+num.get(1));
        wordAdapter itemsAdapter = new wordAdapter(this, num,R.color.category_colors);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
