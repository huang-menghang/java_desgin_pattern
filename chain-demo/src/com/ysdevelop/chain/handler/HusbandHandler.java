package com.ysdevelop.chain.handler;

import com.ysdevelop.chain.woman.IWomen;

/**
 * @author oldhuang
 * @date 2018/10/26
 * @description
 */
public class HusbandHandler extends Handler {

    public HusbandHandler(int level) {
        super(Handler.HUSBAND_LEVEL_REQUEST);
    }

    @Override
    public void response(IWomen women) {
        System.out.println("妻子向丈夫发送请求...");
    }
}
