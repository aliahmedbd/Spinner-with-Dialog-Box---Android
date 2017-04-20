package com.bs23.aliahmed.dialogspinner;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;


import java.util.HashMap;
import java.util.List;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.CustomViewHolder> {

    private List<Model> models;
    private Context mContext;

    private OnItemClickListener onItemClickListener;
    private HashMap<String, Integer> mCompanyNameToDrawableResIdMap;

    //private OnRecyclerViewItemChildClickListener
    public OnItemClickListener getOnItemClickListener() {
        return onItemClickListener;
    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.onItemClickListener = onItemClickListener;
    }

    public MyRecyclerViewAdapter(Context context, List<Model> models) {
        this.models = models;
        this.mContext = context;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(mContext).inflate(R.layout.item,null);
        RecyclerView.LayoutParams lp = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        view.setLayoutParams(lp);
        CustomViewHolder viewHolder = new CustomViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(final CustomViewHolder customViewHolder, int i) {
        final Model model = models.get(i);

        //Setting text view title
        customViewHolder.text1.setText(model.getText1());
        customViewHolder.text2.setText(model.getText2());
        customViewHolder.bind(model, onItemClickListener);

    }

    @Override
    public int getItemCount() {
        return (null != models ? models.size() : 0);
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {
        TextView text1;
        TextView text2;

        CustomViewHolder(View view) {
            super(view);
            this.text1 = (TextView) view.findViewById(R.id.text1);
            this.text2 = (TextView) view.findViewById(R.id.text2);

        }

        public void bind(final Model item, final OnItemClickListener listener) {
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    listener.onItemClick(item);
                }
            });
        }
    }
}