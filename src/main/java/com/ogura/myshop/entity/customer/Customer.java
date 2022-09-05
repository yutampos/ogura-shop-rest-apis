package com.ogura.myshop.entity.customer;

import lombok.Data;

@Data
public class Customer {
    private String userId;
    private String nickname;
    private String firstName;
    private String lastName;
    private String firstNameKana;
    private String lastNameKana;
    private String zipCode;
    private String prefecture;
    private String city;
    private String otherAddress;
    private String email;
    private String tell;
}
