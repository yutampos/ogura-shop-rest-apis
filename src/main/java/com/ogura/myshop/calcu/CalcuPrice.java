package com.ogura.myshop.calcu;

import org.springframework.stereotype.Component;

@Component
public class CalcuPrice {

    public int culcPrice(int price, int tax) {
	double taxNum = (double) tax / 100 + 1;
	double taxOnPrice = price * taxNum;
	int Price = (int) taxOnPrice;

	return Price;
    }

}
