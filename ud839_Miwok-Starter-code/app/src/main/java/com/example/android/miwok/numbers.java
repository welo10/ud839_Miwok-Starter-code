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
            add(new word("one", "lutti")); add(new word("two", "otiiko"));add(new word("three", "tolookosu"));add(new word("four", "oyyisa"));add(new word("five", "massokka"));
            add(new word("six", "temmokka")); add(new word("seven", "kenekaku"));add(new word("eight", "kawinta"));add(new word("nine", "wo'e"));add(new word("ten", "na’aacha"));

        }};
        Log.v("numbers","word at list[0]"+num.get(0));
        Log.v("numbers","word at list[1]"+num.get(1));
        wordAdapter itemsAdapter = new wordAdapter(this, num);

        ListView listView = (ListView) findViewById(R.id.list);

        listView.setAdapter(itemsAdapter);
    }
}
