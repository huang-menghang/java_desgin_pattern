package com.ysdevelop.mediator.meditaor;



/**
 * 中间者抽象类，给采购类，库存类，促销类做中介者
 */
public abstract class AbstractMeditaor {

    protected Purchase purchase;

    protected Sale sale;

    protected Stock stock;

    public AbstractMeditaor() {
        // 将中介者传到各个模块类之中，供各个模块调用
        purchase = new Purchase(this);
        sale = new Sale(this);
        stock = new Stock(this);
    }

    /**
     * 通过该方法执行各个类之间的关系，达到解耦类
     *
     * @param str
     * @param objects
     */
    public abstract void excute(String str, Object... objects);


}
