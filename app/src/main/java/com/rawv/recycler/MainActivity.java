package com.rawv.recycler;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    SimpleRecyclerViewAdapter adapter;
    RecyclerView recyclerView;
    LinearLayoutManager layoutManager;

    ArrayList<String> meroAPIkoData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        meroAPIkoData.add("Jab tak todega nai, Xodega nai!!");
        meroAPIkoData.add("Sabka badla lega re tera faisal");
        meroAPIkoData.add("Violence Violence Violence");
        meroAPIkoData.add("I don't like it, I avoid");
        meroAPIkoData.add("Violence Likes Me, I cant Avoid");


        recyclerView = findViewById(R.id.recycler_view);
        adapter = new SimpleRecyclerViewAdapter(meroAPIkoData);
        layoutManager = new LinearLayoutManager(this,RecyclerView.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}