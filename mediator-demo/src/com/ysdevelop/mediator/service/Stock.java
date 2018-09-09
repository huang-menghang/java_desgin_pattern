package com.ysdevelop.mediator.service;

/**
 * 库存管理类
 */
public class Stock {

    /**
     * 初始化电脑数
     */
    private static int COMPUTER_NUMBER = 100;

    /**
     * 减少库存数量
     *
     * @param number
     */
    public void decrease(int number) {
        COMPUTER_NUMBER = COMPUTER_NUMBER - number;
        System.out.println("库存数量: " + COMPUTER_NUMBER);

    }


    /**
     * 库存增加
     *
     * @param number
     */
    public void increase(int number) {
        COMPUTER_NUMBER = COMPUTER_NUMBER + number;
        System.out.println("库存数量: " + COMPUTER_NUMBER);
    }


    /**
     * 获得库存数量
     *
     * @return
     */
    public int getStockNumber() {
        return COMPUTER_NUMBER;
    }

    /**
     * 清空库存
     */
    public void clearStock() {
        Purchase purchase = new Purchase();
        Sale sale = new Sale();
        System.out.println("清空库存为: " + COMPUTER_NUMBER);
        // 要求折扣销售
        sale.offSale();
        // 要求采购人员不要采购
        purchase.refuseBuyIBM();
    }


}
