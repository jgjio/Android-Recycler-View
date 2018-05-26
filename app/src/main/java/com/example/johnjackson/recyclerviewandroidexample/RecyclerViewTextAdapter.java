package com.example.johnjackson.recyclerviewandroidexample;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class RecyclerViewTextAdapter extends RecyclerView.Adapter<RecyclerViewTextAdapter.NumberViewHolder> {
    private int mNumberItems;


    public RecyclerViewTextAdapter(int numberOfItems) {
        mNumberItems = numberOfItems;
    }

    @Override
    public int getItemCount() {
        return mNumberItems;
    }

    @Override
    public NumberViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        Context context = viewGroup.getContext();
        int layoutIdForListItem = R.layout.list_item;
        LayoutInflater inflater = LayoutInflater.from(context);
        boolean shouldAttachToParentImmediately = false;
        View view = inflater.inflate(layoutIdForListItem, viewGroup, shouldAttachToParentImmediately);
        NumberViewHolder viewHolder = new NumberViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewTextAdapter.NumberViewHolder holder, int position) {
        holder.bind(position);
    }


    class NumberViewHolder extends RecyclerView.ViewHolder {
        TextView listItemView;

        public NumberViewHolder(View itemView) {
            super(itemView);
            listItemView = (TextView) itemView.findViewById(R.id.text_view_item);
        }

        void bind (int listIndex) {
            listItemView.setText(String.valueOf(listIndex));
        }
    }


}
