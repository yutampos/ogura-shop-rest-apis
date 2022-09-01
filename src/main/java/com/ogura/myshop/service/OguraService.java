package com.ogura.myshop.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ogura.myshop.dao.Dao;
import com.ogura.myshop.entity.form.FormData;
import com.ogura.myshop.entity.item.Item;
import com.ogura.myshop.entity.item.ItemCreate;
import com.ogura.myshop.entity.item.ItemImages;
import com.ogura.myshop.entity.item.ItemUpdate;

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
}
