package com.example.rathana.recyclerviewdemo.adpater;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.rathana.recyclerviewdemo.R;
import com.example.rathana.recyclerviewdemo.entity.News;
import com.squareup.picasso.Picasso;

import java.util.List;

/**
 * Created by RATHANA on 1/14/2018.
 */

public class NewsAdapter extends RecyclerView.Adapter<NewsAdapter.ViewHolder>{
    static final String TAG="NewsAdapter";
    private List<News> newsList;
    private Context context;

    public void setNewsList(List<News> list){
        this.newsList=list;
        Log.e(TAG, "setNewsList: "+ this.newsList.size() );
        notifyDataSetChanged();
    }
    public NewsAdapter(Context context, List<News> newsList){
        this.context=context;this.newsList=newsList;
    }


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.news_item_layout,
                parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        if(this.newsList!=null || !this.newsList.isEmpty()){
            News news=this.newsList.get(position);
            if(null!=news.getTitle()) holder.title.setText(news.getTitle());
            if(null!=news.getContent()) holder.content.setText(news.getContent());
            if(news.getThumb()!=0){
                Picasso.with(context)
                        .load(news.getThumb())
                        .into(holder.thumb);
            }
        }
    }

    @Override
    public int getItemCount() {
        return this.newsList.size();
    }

    static final class ViewHolder extends RecyclerView.ViewHolder{
        private TextView title;
        private TextView content;
        private TextView btnShare;
        private TextView btnLearnMore;
        private ImageView thumb;
        public ViewHolder(View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.newTitle);
            content=itemView.findViewById(R.id.newContent);
            btnShare=itemView.findViewById(R.id.btnShare);
            btnLearnMore=itemView.findViewById(R.id.btnLearnMore);
            thumb=itemView.findViewById(R.id.newsImage);
        }
    }
}
