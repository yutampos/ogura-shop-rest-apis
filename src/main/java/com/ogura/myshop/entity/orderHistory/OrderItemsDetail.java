package com.ogura.myshop.entity.orderHistory;

import java.util.Date;

import lombok.Data;

@Data
public class OrderItemsDetail {
    private Integer orderItemsId;
    private Integer itemId;
    private Integer quantity;
    private Integer productTotal;
    private Date orderDate;
    private Date deliveryDate;
}
