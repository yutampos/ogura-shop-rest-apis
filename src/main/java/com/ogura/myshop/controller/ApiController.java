package com.ogura.myshop.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ogura.myshop.entity.form.FormData;
import com.ogura.myshop.entity.item.Item;
import com.ogura.myshop.entity.item.ItemImages;
import com.ogura.myshop.service.OguraService;

@RestController
//@CrossOrigin(origins = "http://localhost:3000")
@CrossOrigin(origins = "https://www.ogura-shop.com/")
@RequestMapping("/api")
public class ApiController {

    final OguraService oguraService;

    public ApiController(OguraService oguraService) {
	this.oguraService = oguraService;
    }

    // 商品データ関連

    // 新着順に商品情報を20件取得する。
    @GetMapping("/item")
    public List<Item> getItems() {
	List<Item> getTopData = oguraService.getItems();
	return getTopData;
    }

    // 一つの商品データを取得する
    @GetMapping("/item/{id}")
    public Item getItems(@PathVariable("id") int id) {
	Item getOnlyItem = null;
	List<ItemImages> itemImages = null;
	try {
	    getOnlyItem = oguraService.findByOnly(id);
	    itemImages = oguraService.findByItemImages(id);
	    try {
		getOnlyItem.setItemImages(itemImages);
	    } catch (Exception e) {
		System.out.println(e);
	    }
	} catch (Exception e) {
	    System.out.println(e);
	}

	return getOnlyItem;
    }

    // リクエストパラムを取得する。その値を使って商品を検索する。検索ワードありの場合。
    @GetMapping("/search/{id}/{name}")
    public List<Item> getSearchItems(@PathVariable("id") int gId, @PathVariable("name") String name, FormData formData,
	    Item item) {
	formData.setSearchName(name);
	formData.setSearchId(gId);

	Integer id = formData.getSearchId();
	List<Item> findItems = null;
	if (id > 0) {
	    findItems = oguraService.findByGroupId(formData);

	} else if (id == 0) {
	    findItems = oguraService.findByAll(formData);

	}

	return findItems;
    }

    // リクエストパラムを取得する。その値を使って商品を検索する。検索ワードなしの場合。
    @GetMapping("/search/{id}/null")
    public List<Item> getSearchItemsById(@PathVariable("id") int gId, FormData formData, Item item) {

	formData.setSearchId(gId);

	Integer id = formData.getSearchId();
	List<Item> findItems = null;
	if (id > 0) {
	    findItems = oguraService.findByGroupId(formData);

	} else if (id == 0) {
	    findItems = oguraService.findByAll(formData);

	}

	return findItems;
    }

//    @GetMapping("/get/comment/{itemId}")
//    public List<ItemComment> getItemComment(@PathVariable("itemId") Integer itemId) {
//	List<ItemComment> getData = null;
//	try {
//	    getData = oguraService.findComment(itemId);
//	} catch (Exception e) {
//	    System.out.println(e);
//	}
//
//	return getData;
//    }
//
//    @PostMapping("/add/comment")
//    public void addItemComment(@RequestBody ItemComment itemComment) {
//
//	try {
//	    oguraService.addComment(itemComment);
//	} catch (Exception e) {
//	    System.out.println(e);
//	}
//
//    }
//
////注文データ関連
//
//    // 注文情報を登録する
//    @PostMapping("/add-order")
//    public void setCheckoutData(@RequestBody OrderRequest orderRequest) {
//	try {
//	    OrderRequest data = orderRequest;
//	    System.out.println(orderRequest);
//	    oguraService.createDelivery(data);
//
//	    oguraService.createOrderItems(nextOrderItemsId(), data.getCartData());
//
//	    try {
//
//		if (data.getDeliveryId() != null && nextOrderItemsId() != null) {
//		    oguraService.createOrderMain(data, nextOrderItemsId());
//		} else {
//		    System.out.println("delivery_id もしくは order_items_idが存在しません。");
//		}
//
//	    } catch (Exception error) {
//		System.out.println(error);
//	    }
//	} catch (Exception error) {
//	    System.out.println(error);
//	}
//
//    }
//
//    public Integer nextOrderItemsId() {
//	Integer orderItemsId = oguraService.nextOrderItemsId();
//
//	return orderItemsId;
//    }
//
//    // 注文履歴を取得する
//    @PostMapping("/order-history/get")
//    public List<OrderHistory> getOrderHistory(@RequestBody OrderHistory orderHistory) {
//	String userId = orderHistory.getUserId();
//	try {
//	    List<OrderHistory> getData = oguraService.getOrderHistory(userId);
//
//	    List<OrderItemsDetail> getItemsDetail = oguraService.findOrderItemsDetail(userId);
//
//	    // OrderHistoryの中のアイテム詳細リスト（List<OrderItemsDetail>）に購入商品リストID（orderItemsId）が一致したアイテムデータだけを格納している。
//	    getData.forEach((d) -> {
//		List<OrderItemsDetail> detail = new ArrayList<OrderItemsDetail>();
//		getItemsDetail.stream().filter(str -> str.getOrderItemsId() == d.getOrderItemsId())
//			.forEach(each -> detail.add(each));
//		d.setOrderItemsDetail(detail);
//	    });
//	    return getData;
//	} catch (Exception e) {
//	    System.out.println(e);
//
//	}
//	return null;
//
//    }
//
//// 顧客データ関連
//
//    // お客様情報を取得する
//    @PostMapping("/customer/get")
//    public Customer findCustomer(@RequestBody Customer customer) {
//	Customer getData = oguraService.findCustomer(customer);
//	try {
//	    if (getData == null) {
//		oguraService.createFirstCustomer(customer);
//	    } else {
//	    }
//	} catch (Exception e) {
//	    System.out.println(e);
//	}
//	return getData;
//    }
//
//    // お客様情報を編集する
//    @PostMapping("/customer/edit")
//    public void editCustomer(@RequestBody Customer customer) {
//	oguraService.updateCustomer(customer);
//    }
//
}
