package com.ysdevelop.mediator.meditaor;

public class Meditaor extends AbstractMeditaor {

    @Override
    public void excute(String str, Object... objects) {
        if (str.equals("purchase.buy")) {
            this.buyComputer((Integer) objects[0]);
        } else if (str.equals("sale,sell")) {
            this.sellComputer((Integer) objects[0]);
        } else if (str.equals("sale.offsell")) {
            this.offSell();
        } else if (str.equals("stock.clear")) {
            this.clearStock();
        }
    }

    /**
     * 清理库存
     */
    public void clearStock() {
        // 要求清仓销售
        super.sale.offSale();
        // 采购人员不要采购
        super.purchase.refuseBuyIBM();
    }

    private void offSell() {
        System.out.println("折价销售电脑 " + stock.getStockNumber() + "台");
    }

    /**
     * 销售电脑
     *
     * @param number
     */
    private void sellComputer(Integer number) {
        if (super.stock.getStockNumber() < number) {
            super.purchase.buyIBMcomputer(number);
        }
        super.stock.decrease(number);

    }

    /**
     * 采购电脑
     *
     * @param number
     */
    private void buyComputer(Integer number) {
        int saleStatus = super.sale.getSaleStatus();
        if (saleStatus > 80) {
            System.out.println("采购电脑:" + number + "台");
            super.stock.increase(number);
        } else {
            int buyNumber = number / 2;
            System.out.println("采购电脑:" + buyNumber + "台");
            super.stock.increase(buyNumber);
        }
    }
}
