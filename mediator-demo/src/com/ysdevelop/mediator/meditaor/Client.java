package com.ysdevelop.mediator.meditaor;

/**
 * 中介者模式客户端启动类，启动入口类
 * 用一个中介对象封装一系列的对象交互，中介者使各个对象不需要显示地互相作用，使而其耦合松
 */
public class Client {
    public static void main(String[] args) {
        AbstractMeditaor meditaor = new Meditaor();
        // 采购人员采购电脑
        System.out.println("------采购人员采购电脑------");
        Purchase purchase = new Purchase(meditaor);
        purchase.buyIBMcomputer(100);
        // 销售人员销售电脑
        System.out.println("\n-----销售人员销售电脑-------");
        Sale sale = new Sale(meditaor);
        sale.sellComputer(1);
        //库房管理库存
        System.out.println("\n-----库存管理人员清理库存");
        Stock stock = new Stock(meditaor);
        stock.clearStock();
    }
}
