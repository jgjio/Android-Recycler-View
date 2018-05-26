package com.example.johnjackson.recyclerviewandroidexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;


public class MainActivity extends AppCompatActivity {

    private static final int NUM_ITEMS = 100;
    private RecyclerViewTextAdapter mTextRecyclerViewAdapter;
    private RecyclerView mTextList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextList = findViewById(R.id.recycler_view_items);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        mTextList.setLayoutManager(layoutManager);
        mTextList.setHasFixedSize(true);
        mTextRecyclerViewAdapter = new RecyclerViewTextAdapter(NUM_ITEMS);
        mTextList.setAdapter(mTextRecyclerViewAdapter);

    }
}
