package com.ogura.myshop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ogura.myshop.entity.customer.Customer;
import com.ogura.myshop.entity.form.FormData;
import com.ogura.myshop.entity.item.Item;
import com.ogura.myshop.entity.item.ItemComment;
import com.ogura.myshop.entity.item.ItemCreate;
import com.ogura.myshop.entity.item.ItemImages;
import com.ogura.myshop.entity.item.ItemUpdate;
import com.ogura.myshop.entity.order.CartData;
import com.ogura.myshop.entity.order.OrderRequest;
import com.ogura.myshop.entity.orderHistory.OrderHistory;
import com.ogura.myshop.entity.orderHistory.OrderItemsDetail;

@Mapper
public interface Dao {
    public List<Item> latestItems();

    public void create(@Param("itemC") ItemCreate itemC);

    public List<Item> findByGroupId(@Param("search") FormData form);

    public List<Item> findByAll(@Param("search") FormData form);

    public Item findByOnly(@Param("id") int id);

    public void update(@Param("itemU") ItemUpdate itemU);

    public void delete(int itemD);

    public List<ItemImages> findByItemImages(@Param("id") int id);

    public List<ItemComment> findComment(Integer id);

    public void addComment(@Param("ic") ItemComment itemComment);

    public void createDelivery(@Param("od") OrderRequest data);

    public Integer nextOrderItemsId();

    public void createOrderItems(@Param("id") Integer id, @Param("cd") List<CartData> cd);

    public void createOrderMain(@Param("od") OrderRequest data, @Param("orderItemsId") Integer orderItemsId);

    public List<OrderHistory> findOrderHistory(@Param("userId") String userId);

    public List<OrderItemsDetail> findOrderItemsDetail(String userId);

    public Customer findCustomer(@Param("customer") Customer customer);

    public void registerOfCustomer(@Param("customer") Customer customer);

    public void updateCustomer(@Param("customer") Customer customer);
}
