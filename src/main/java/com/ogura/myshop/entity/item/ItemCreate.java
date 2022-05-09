package com.ogura.myshop.entity.item;

import lombok.Data;

@Data
public class ItemCreate {
    private int item_id;
    private int taxId;
    private String name;
    private String description;
    private int price;
    private String status;
    private int groupId;
    private String url;

}
