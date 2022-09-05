package com.ogura.myshop.entity.order;

import lombok.Data;

@Data
public class CartData {
    private Integer itemId;
    private Integer quantity;
    private Integer price;
}
