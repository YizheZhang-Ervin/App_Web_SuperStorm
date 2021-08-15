package com.ervin.exceptions;

public class paramsException extends RuntimeException{
    Integer code =500;
    String msg = "parameter exception";

    public paramsException(){
        super("parameter exception");
    }

    public paramsException(String msg){
        super(msg);
        this.msg = msg;
    }

    public paramsException(Integer code){
        super("parameter exception");
        this.code = code;
    }
    public paramsException(Integer code,String msg){
        super("parameter exception");
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
