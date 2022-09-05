package com.ogura.myshop.entity.orderHistory;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class OrderHistory {
    private Integer id;
    private String userId;
    private Integer orderItemsId;
    private Integer deliveryId;
    private String otherAddress;
    private String zipCode;
    private String prefecture;
    private String city;
    private Date orderDate;
    private Date deliveryDate;
    private Integer deliveryCharge;
    private Integer totalPayment;

    private List<OrderItemsDetail> orderItemsDetail;
}
