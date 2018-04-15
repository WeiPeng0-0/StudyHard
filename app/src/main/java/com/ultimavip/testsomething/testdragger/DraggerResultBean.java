package com.ultimavip.testsomething.testdragger;

import javax.inject.Inject;

/**
 * Created by zhuxing on 2018/4/12.
 * 数据接收
 */

public class DraggerResultBean {
    String msg;
    String code;
    boolean success;
    String data;

    @Inject
    public DraggerResultBean () {

    }

    public String getMsg () {
        return msg;
    }

    public void setMsg (String msg) {
        this.msg = msg;
    }

    public String getCode () {
        return code;
    }

    public void setCode (String code) {
        this.code = code;
    }

    public boolean isSuccess () {
        return success;
    }

    public void setSuccess (boolean success) {
        this.success = success;
    }

    public String getData () {
        return data;
    }

    public void setData (String data) {
        this.data = data;
    }

    @Override
    public String toString () {
        return "ResultBean{" +
                "msg='" + msg + '\'' +
                ", code='" + code + '\'' +
                ", success=" + success +
                ", data='" + data + '\'' +
                '}';
    }


}
