package com.ysdevelop.mediator.meditaor;

public class Purchase extends AbstractCollegue {

    /**
     * @param meditaor 传入中介者
     */
    public Purchase(AbstractMeditaor meditaor) {
        super(meditaor);
    }

    /**
     * 根据中介者采购IBM电脑
     *
     * @param number
     */
    public void buyIBMcomputer(int number) {
        super.meditaor.excute("purchase.buy", number);
    }

    /**
     * 不再采购电脑
     */
    public void refuseBuyIBM() {
        System.out.println("不再采购电脑");
    }


}
