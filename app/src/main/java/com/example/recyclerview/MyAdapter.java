package com.example.recyclerview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.data.ItemData;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private List<ItemData> itemDataList;

    public MyAdapter(List<ItemData> itemDataList) {
        this.itemDataList = itemDataList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.activity_list_item, parent, false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        ItemData itemData = itemDataList.get(position);
        holder.setTitleText(itemData.title);
        holder.setNumberText(String.valueOf(itemData.number));
        holder.setDescriptionText(itemData.description);
    }

    @Override
    public int getItemCount() {
        return itemDataList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView title, number, description;

        public void setTitleText(String title) {
            this.title.setText(title);
        }

        public void setNumberText(String number) {
            this.number.setText(number);
        }

        public void setDescriptionText(String description) {
            this.description.setText(description);
        }

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            this.title = itemView.findViewById(R.id.item_title);
            this.number = itemView.findViewById(R.id.item_number);
            this.description = itemView.findViewById(R.id.item_description);
        }
    }
}
