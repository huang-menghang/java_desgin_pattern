package com.ysdevelop.mediator.main;

import com.ysdevelop.mediator.service.Purchase;
import com.ysdevelop.mediator.service.Sale;
import com.ysdevelop.mediator.service.Stock;

/**
 * 中介者设计模式client场景类
 */
public class Client {


    /**
     * @param args 初始化参数
     */
    public static void main(String[] args) {
        System.out.printf("----采购人员,开始采购电脑------");
        Purchase purchase = new Purchase();
        purchase.buyIBMcomputer(100);
        // 销售人员销售电脑
        System.out.println("---销售人员销售电脑");
        Sale sale = new Sale();
        sale.sellIBMComputer(1);
        // 库存清理库存
        System.out.println("--库存管理清理库存");
        Stock stock = new Stock();
        stock.clearStock();

    }

}
