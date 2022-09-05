package com.ogura.myshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ogura.myshop.dao.Dao;
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

@Service
public class OguraService {
    @Autowired
    Dao dao;

    public List<Item> getItems() {
	return dao.latestItems();
    }

    public void itemCreate(ItemCreate itemCreate) {
	dao.create(itemCreate);
    }

    public List<Item> findByGroupId(FormData form) {
	return dao.findByGroupId(form);
    }

    public List<Item> findByAll(FormData form) {
	return dao.findByAll(form);
    }

    public Item findByOnly(int id) {
	return dao.findByOnly(id);
    }

    public void itemUpdate(ItemUpdate itemUpdate) {
	dao.update(itemUpdate);
    }

    public void itemDelete(int itemDelete) {
	dao.delete(itemDelete);
    }

    public List<ItemImages> findByItemImages(int id) {
	return dao.findByItemImages(id);
    }

    public List<ItemComment> findComment(Integer id) {
	return dao.findComment(id);
    }

    public void addComment(ItemComment itemComment) {
	dao.addComment(itemComment);
    }

    public void createDelivery(OrderRequest data) {
	dao.createDelivery(data);
    }

    public Integer nextOrderItemsId() {
	return dao.nextOrderItemsId();
    }

    public void createOrderItems(Integer id, List<CartData> cd) {
	dao.createOrderItems(id, cd);
    }

    public void createOrderMain(OrderRequest data, Integer id) {
	dao.createOrderMain(data, id);
    }

    public List<OrderHistory> findOrderHistory(String userId) {
	return dao.findOrderHistory(userId);
    }

    public List<OrderItemsDetail> findOrderItemsDetail(String userId) {
	return dao.findOrderItemsDetail(userId);
    }

    public Customer findCustomer(Customer customer) {
	return dao.findCustomer(customer);
    }

    public void registerOfCustomer(Customer customer) {
	dao.registerOfCustomer(customer);
    }

    public void updateCustomer(Customer customer) {
	dao.updateCustomer(customer);
    }
}
