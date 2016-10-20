package com.ymr.com.ymrapplication;

/**
 * Created by 123 on 2016/10/20.
 */
public class FirstClass {
    callback caller;
    public void setListener(callback caller){
        this.caller = caller;
    }
    public void call(){
        caller.dosomething();
    }
}
interface callback{
    void dosomething();
}
