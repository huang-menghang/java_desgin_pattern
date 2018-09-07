package com.ysdevelop.mediator.service;

import java.util.Random;

/**
 * 销售类
 */
public class Sale {

    /**
     * @param number
     */
    public void sellIBMComputer(int number) {
        // 访问库存
        Stock stock = new Stock();
        Purchase purchase = new Purchase();
        if (stock.getStockNumber() < number) {
            purchase.buyIBMcomputer(number);
        }
        System.out.println("销售IBM电脑" + number + "台");

    }

    public void offSale() {
        // 库存有多少卖多少
        Stock stock = new Stock();
        System.out.println("折价销售IBM电脑" + stock.getStockNumber() + "台");

    }

    public int getSaleStatus() {
        Random random = new Random(System.currentTimeMillis());
        int saleStatus = random.nextInt(100);
        System.out.println("IBM电脑的销售情况为: " + saleStatus);
        return saleStatus;
    }


}
