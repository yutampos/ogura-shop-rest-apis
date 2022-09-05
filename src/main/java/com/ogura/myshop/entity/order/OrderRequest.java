package com.ogura.myshop.entity.order;

import java.util.List;

import lombok.Data;

@Data
public class OrderRequest {
    private Integer userId;
    private String otherAddress;
    private String zipCode;
    private String prefecture;
    private String city;
    private Integer deliveryCharge;
    private Integer itemId;
    private Integer quantity;
    private Integer productTotal;
    private Integer totalPayment;
    private Integer deliveryId;

    private List<CartData> cartData;

}
