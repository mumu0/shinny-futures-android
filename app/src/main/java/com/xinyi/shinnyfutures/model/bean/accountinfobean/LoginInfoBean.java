package com.xinyi.shinnyfutures.model.bean.accountinfobean;

/**
 * Created on 7/13/17.
 * Created by chenli.
 * Description: .
 */

public class LoginInfoBean {
    private String aid;
    private String req_id;
    private String ret;
    private String msg;
    private String msg_settlement;
    private String[] brokers;

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getReq_id() {
        return req_id;
    }

    public void setReq_id(String req_id) {
        this.req_id = req_id;
    }

    public String getRet() {
        return ret;
    }

    public void setRet(String ret) {
        this.ret = ret;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String[] getBrokers() {
        return brokers;
    }

    public void setBrokers(String[] brokers) {
        this.brokers = brokers;
    }

    public String getMsg_settlement() {
        return msg_settlement;
    }

    public void setMsg_settlement(String msg_settlement) {
        this.msg_settlement = msg_settlement;
    }

}
