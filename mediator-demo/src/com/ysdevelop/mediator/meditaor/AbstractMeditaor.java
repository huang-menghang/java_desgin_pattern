package com.ysdevelop.mediator.meditaor;

import com.ysdevelop.mediator.service.Purchase;
import com.ysdevelop.mediator.service.Sale;
import com.ysdevelop.mediator.service.Stock;

/**
 * 中间者抽象类，给采购类，库存类，促销类做中介者
 */
public abstract class AbstractMeditaor {

    protected Purchase purchase;

    protected Sale sale;

    protected Stock stock;

    public AbstractMeditaor() {
        purchase = new Purchase();
        sale = new Sale();
        stock = new Stock();
    }

    /**
     * @param str
     * @param objects
     */
    public abstract void excute(String str, Object... objects);


}
