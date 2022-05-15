package com.ogura.myshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ogura.myshop.entity.item.Item;
import com.ogura.myshop.service.OguraService;

@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired
    OguraService oguraService;

    @GetMapping("/")
    public List<Item> getItems() {
	List<Item> getTopData = oguraService.getItems();
	return getTopData;
    }
}
