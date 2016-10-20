package com.ymr.com.ymrapplication;

import android.util.Log;

/**
 * Created by 123 on 2016/10/20.
 */

public class SecendClass implements callback{
    private FirstClass firstClass;
    public SecendClass(FirstClass firstClass) {
         this.firstClass = firstClass;
        firstClass.setListener(this);
    }

    public void call(){
        firstClass.call();
    }

    @Override
    public void dosomething() {
        Log.v("ymr","ymr");
    }
}
