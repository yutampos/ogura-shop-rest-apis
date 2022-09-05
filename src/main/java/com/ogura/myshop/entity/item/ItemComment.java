package com.ogura.myshop.entity.item;

import java.util.Date;

import lombok.Data;

@Data
public class ItemComment {
    private Integer id;
    private Integer itemId;
    private String name;
    private String comment;
    private Double rating;
    private Date createdDate;
}
