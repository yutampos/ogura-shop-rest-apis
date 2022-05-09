package com.ogura.myshop.entity.item;

import lombok.Data;

@Data
public class Item {
    private int itemId;
    private int taxId;
    private String name;
    private String description;
    private int price;
    private int taxOnPrice;
    private int taxRate;
    private int groupId;
    private String status;
    private String url;

}
