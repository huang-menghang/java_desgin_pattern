package com.ysdevelop.chain.handler;

import com.ysdevelop.chain.woman.IWomen;

/**
 * @author oldhuang
 * @date 2018/10/26
 * @description
 */
public abstract class Handler {

    public final static int FATHER_LEVEL_REQUEST = 1;

    public final static int HUSBAND_LEVEL_REQUEST = 2;

    public final static int SON_LEVEL_REQUEST = 3;

    private int level = 0;

    private Handler nextHandler;


    public Handler(int level) {
        this.level = level;
    }

    public final void handleMessage(IWomen women) {
        if (women.getType() == level){
           this.response(women);
        }else{
            if(nextHandler != null){
                nextHandler.handleMessage(women);
            }else{
                System.out.println("----没地方请示,当做不同意...");
            }
        }

    }

    public abstract void response(IWomen women);

}
