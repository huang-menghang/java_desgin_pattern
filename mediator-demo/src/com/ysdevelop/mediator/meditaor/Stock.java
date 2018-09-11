package com.ysdevelop.mediator.meditaor;

/**
 * 库存类，用于管理库存
 */
public class Stock extends AbstractCollegue {

    /**
     * 初始化电脑数
     */
    private static int COMPUTER_NUMBER = 100;


    public Stock(AbstractMeditaor meditaor) {
        super(meditaor);
    }

    /**
     * 添加库存
     *
     * @param number
     */
    public void increase(int number) {
        COMPUTER_NUMBER = COMPUTER_NUMBER - number;
        System.out.println("库存数量为: " + COMPUTER_NUMBER);
    }

    /**
     * 库存减少
     *
     * @param number 数量
     */
    public void decrease(int number) {
        COMPUTER_NUMBER = COMPUTER_NUMBER - number;
        System.out.println("库存数量为: " + COMPUTER_NUMBER);
    }

    /**
     * 获得库存
     */
    public int getStockNumber() {
        return COMPUTER_NUMBER;
    }

    /**
     * 清理库存
     */
    public void clearStock() {
        System.out.println("清理库存数量为: " + COMPUTER_NUMBER);
        super.meditaor.excute("stock.clear");
    }


}
