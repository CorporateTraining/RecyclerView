package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.data.ItemData;

import static com.example.recyclerview.data.TypeConstant.TYPE_HEADER;
import static com.example.recyclerview.data.TypeConstant.TYPE_ITEM;

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        switch (viewType) {
            case TYPE_HEADER:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_list_header, parent, false);
                return new HeaderViewHolder(view);
            case TYPE_ITEM:
                view = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_list_item, parent, false);
                return new TextViewHolder(view);
        }
        return null;
    }

    @Override
    public int getItemViewType(int position) {
        ItemData itemData = ItemData.initItemData().get(position)   ;
        switch (itemData.type) {
            case 0:
                return TYPE_ITEM;
            case 1:
                return TYPE_HEADER;
            default:
                return -1;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        ItemData itemData = ItemData.initItemData().get(position);
        switch (itemData.type) {
            case TYPE_HEADER:
                ((HeaderViewHolder) holder).headerContent.setText(itemData.title);
                break;
            case TYPE_ITEM:
                ((TextViewHolder) holder).title.setText(itemData.title);
                ((TextViewHolder) holder).number.setText(String.valueOf(itemData.number));
                ((TextViewHolder) holder).description.setText(itemData.description);
                break;
        }
    }

    @Override
    public int getItemCount() {
        return ItemData.initItemData().size();
    }

    public static class TextViewHolder extends RecyclerView.ViewHolder {
        public View itemView;
        public TextView title, number, description;

        public TextViewHolder(@NonNull View itemView) {
            super(itemView);
            this.itemView = itemView;
            this.title = itemView.findViewById(R.id.item_title);
            this.number = itemView.findViewById(R.id.item_number);
            this.description = itemView.findViewById(R.id.item_description);
        }
    }

    public static class HeaderViewHolder extends RecyclerView.ViewHolder {
        public View itemView;
        public TextView headerContent;

        public HeaderViewHolder(@NonNull View itemView) {
            super(itemView);
            this.itemView = itemView;
            this.headerContent = itemView.findViewById(R.id.header_content);
        }
    }
}
