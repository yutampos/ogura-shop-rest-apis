package com.ogura.myshop.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.ogura.myshop.entity.form.FormData;
import com.ogura.myshop.entity.item.Item;
import com.ogura.myshop.entity.item.ItemCreate;
import com.ogura.myshop.entity.item.ItemImages;
import com.ogura.myshop.entity.item.ItemUpdate;

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
}
