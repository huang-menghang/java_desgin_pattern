package com.ysdevelop.mediator.meditaor;

import java.util.Random;

/**
 * sale
 */
public class Sale extends AbstractCollegue {

    public Sale(AbstractMeditaor meditaor) {
        super(meditaor);
    }

    /**
     * 销售电脑
     *
     * @param number
     */
    public void sellComputer(int number) {
        super.meditaor.excute("sale.sell", number);
        System.out.println("销售IBM电脑" + number + "台");
    }

    /**
     * 获取销售数量
     *
     * @return
     */
    public int getSaleStatus() {
        Random random = new Random(System.currentTimeMillis());
        int saleStatus = random.nextInt(100);
        System.out.println("IBM销售电脑情况为: " + saleStatus);
        return saleStatus;
    }

    /**
     * 打折处理
     */
    public void offSale() {
        super.meditaor.excute("sale.offsell");
    }



}
