package com.ysdevelop.mediator.service;

/**
 * 采购管理类
 */
public class Purchase {

    /**
     * 采购电脑
     *
     * @param number 够买的数量
     */
    public void buyIBMcomputer(int number) {
        // 访问库存
        Stock stock = new Stock();
        // 访问销售
        Sale sale = new Sale();

        int saleStatus = sale.getSaleStatus();
        // 如果销售数量大于80直接添加
        if (saleStatus > 80) {
            System.out.println("采购电脑" + number + "台");
            stock.increase(number);
        } else {
            int buynumber = number / 2;
            System.out.println("采购电脑: " + buynumber + "台");
            stock.increase(buynumber);
        }


    }

    public void refuseBuyIBM() {
        System.out.println("不再采购IBM电脑");
    }


}
