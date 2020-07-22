package com.example.recyclerview.data;

import java.util.ArrayList;
import java.util.List;

import static com.example.recyclerview.data.TypeConstant.TYPE_HEADER;
import static com.example.recyclerview.data.TypeConstant.TYPE_ITEM;

public class ItemData {
    public int type;
    public String title;
    public String description;
    public int number;
    public String avatar;

    public ItemData(int type, String title, String description, int number, String avatar) {
        this.type = type;
        this.title = title;
        this.description = description;
        this.number = number;
        this.avatar = avatar;
    }

    public static List<ItemData> initItemData() {
        List<ItemData> dataList = new ArrayList<>();
        dataList.add(new ItemData(TYPE_HEADER, "This is header", null, 0, null));
        for (int i = 1; i <= 100; i++) {
            dataList.add(new ItemData(TYPE_ITEM, "title" + i, "desp" + i, i, "https://loremflickr.com/180/180?lock=" + i));
        }
        return dataList;
    }
}
