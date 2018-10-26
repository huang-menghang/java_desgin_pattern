package com.ysdevelop.chain.handler;

import com.ysdevelop.chain.woman.IWomen;

/**
 * @author oldhuang
 * @date 2018/10/26
 * @description
 */
public class FaherHandler extends Handler {

    public FaherHandler() {
        super(Handler.FATHER_LEVEL_REQUEST);
    }

    @Override
    public void response(IWomen women) {
        System.out.println("女儿向父亲发送请求...");
    }
}
