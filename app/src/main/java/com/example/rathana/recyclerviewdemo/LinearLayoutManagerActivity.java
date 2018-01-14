package com.example.rathana.recyclerviewdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.rathana.recyclerviewdemo.adpater.NewsAdapter;
import com.example.rathana.recyclerviewdemo.entity.News;

import java.util.ArrayList;
import java.util.List;

public class LinearLayoutManagerActivity extends AppCompatActivity {

    private List<News> list=new ArrayList<>();
    private RecyclerView recyclerView;
    private NewsAdapter newsAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear_layout_manager);
        setUpRecyclerView();
    }

    private void setUpRecyclerView() {
        recyclerView=findViewById(R.id.recyclerView);
        LinearLayoutManager linear=new LinearLayoutManager(this);
        linear.setOrientation(LinearLayoutManager.HORIZONTAL);
        recyclerView.setLayoutManager(linear);
        this.newsAdapter=new NewsAdapter(this,this.list);
        recyclerView.setAdapter(this.newsAdapter);
        setNewsItems();
    }

    private void setNewsItems() {
        for(int i =0;i<50;i++){
            this.list.add(new News(i ,
                    "Create Cards "+i,
                    "that have a consistent look across the platform. CardView widgets can have shadows and rounded corners.",
                    R.drawable.default_news_thumb));
        }
        newsAdapter.setNewsList(this.list);
    }
}
