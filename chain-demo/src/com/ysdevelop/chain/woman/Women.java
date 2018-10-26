package com.ysdevelop.chain.woman;

/**
 * @author oldhuang
 * @date 2018/10/26
 * @description
 */
public class Women implements IWomen {

    private int type;

    private String request = null;

    public Women(int type, String request) {
        this.type = type;
        switch (type) {
            case 1:
                this.request = "女儿请求是," + request;
                break;
            case 2:
                this.request = "丈夫的请求是," + request;
                break;
            case 3:
                this.request = "母亲的请求是," + request;
                break;

        }
        this.request = request;
    }

    @Override
    public int getType() {
        return this.type;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
