package com.ysdevelop.mediator.meditaor;

/**
 * 抽象同事类
 */
public abstract class AbstractCollegue {

    protected AbstractMeditaor meditaor;

    public AbstractCollegue(AbstractMeditaor meditaor) {
        this.meditaor = meditaor;
    }


}
