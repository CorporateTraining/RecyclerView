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

    public ItemData(int type, String title, String description, int number) {
        this.type = type;
        this.title = title;
        this.description = description;
        this.number = number;
    }

    public static List<ItemData> initItemData() {
        List<ItemData> dataList = new ArrayList<>();
        dataList.add(new ItemData(TYPE_HEADER, "This is header", null, 0));
        dataList.add(new ItemData(TYPE_ITEM, "title1", "desp1", 1));
        dataList.add(new ItemData(TYPE_ITEM, "title2", "desp2", 2));
        dataList.add(new ItemData(TYPE_ITEM, "title3", "desp3", 3));
        dataList.add(new ItemData(TYPE_ITEM, "title4", "desp4", 4));
        dataList.add(new ItemData(TYPE_ITEM, "title5", "desp5", 5));
        dataList.add(new ItemData(TYPE_ITEM, "title6", "desp6", 6));
        dataList.add(new ItemData(TYPE_ITEM, "title7", "desp7", 7));
        dataList.add(new ItemData(TYPE_ITEM, "title8", "desp8", 8));
        dataList.add(new ItemData(TYPE_ITEM, "title9", "desp9", 9));
        dataList.add(new ItemData(TYPE_ITEM, "title10", "desp10", 10));
        dataList.add(new ItemData(TYPE_ITEM, "title11", "desp11", 11));
        return dataList;
    }
}
