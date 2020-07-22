package com.example.recyclerview.data;

import java.util.ArrayList;
import java.util.List;

public class ItemData {
    public String title;
    public String description;
    public int number;

    public ItemData(String title, String description, int number) {
        this.title = title;
        this.description = description;
        this.number = number;
    }

    public static List<ItemData> initItemData() {
        List<ItemData> dataList = new ArrayList<>();
        dataList.add(new ItemData("title1", "desp1", 1));
        dataList.add(new ItemData("title2", "desp2", 2));
        dataList.add(new ItemData("title3", "desp3", 3));
        dataList.add(new ItemData("title4", "desp4", 4));
        dataList.add(new ItemData("title5", "desp5", 5));
        dataList.add(new ItemData("title6", "desp6", 6));
        dataList.add(new ItemData("title7", "desp7", 7));
        dataList.add(new ItemData("title8", "desp8", 8));
        dataList.add(new ItemData("title9", "desp9", 9));
        dataList.add(new ItemData("title10", "desp10", 10));
        dataList.add(new ItemData("title11", "desp11", 11));
        return dataList;
    }
}
