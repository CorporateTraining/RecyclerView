package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.data.ItemData;

import java.util.List;

import static com.example.recyclerview.data.TypeConstant.TYPE_HEADER;
import static com.example.recyclerview.data.TypeConstant.TYPE_ITEM;

public class MyAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private List<ItemData> itemDataList;

    public MyAdapter(List<ItemData> itemDataList) {
        this.itemDataList = itemDataList;
    }

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
        ItemData itemData = itemDataList.get(position)   ;
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
        ItemData itemData = itemDataList.get(position);
        switch (itemData.type) {
            case TYPE_HEADER:
                HeaderViewHolder headerViewHolder = (HeaderViewHolder) holder;
                headerViewHolder.setHeaderContentText(itemData.title);
                break;
            case TYPE_ITEM:
                TextViewHolder textViewHolder = (TextViewHolder) holder;
                textViewHolder.setTitleText(itemData.title);
                textViewHolder.setNumberText(String.valueOf(itemData.number));
                textViewHolder.setDescriptionText(itemData.description);
                break;
        }
    }

    @Override
    public int getItemCount() {
        return itemDataList.size();
    }

    public static class TextViewHolder extends RecyclerView.ViewHolder {
        private TextView title, number, description;

        public void setTitleText(String title) {
            this.title.setText(title);
        }

        public void setNumberText(String number) {
            this.number.setText(number);
        }

        public void setDescriptionText(String  description) {
            this.description.setText(description);
        }

        public TextViewHolder(@NonNull View itemView) {
            super(itemView);
            this.title = itemView.findViewById(R.id.item_title);
            this.number = itemView.findViewById(R.id.item_number);
            this.description = itemView.findViewById(R.id.item_description);
        }
    }

    public static class HeaderViewHolder extends RecyclerView.ViewHolder {
        public TextView headerContent;

        public void setHeaderContentText(String headerContent) {
            this.headerContent.setText(headerContent);
        }

        public HeaderViewHolder(@NonNull View itemView) {
            super(itemView);
            this.headerContent = itemView.findViewById(R.id.header_content);
        }
    }
}
