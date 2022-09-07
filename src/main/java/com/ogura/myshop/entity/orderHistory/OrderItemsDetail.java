package com.ogura.myshop.entity.orderHistory;

import java.util.Date;
import java.time.LocalDate;

import lombok.Data;

@Data
public class OrderItemsDetail {
    private Integer orderItemsId;
    private Integer itemId;
    private Integer quantity;
    private Integer productTotal;
    private Date orderDate;
    private LocalDate deliveryDate;
    private String name;
    private String url;
}
