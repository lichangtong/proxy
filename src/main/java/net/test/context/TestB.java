package net.test.context;

import com.sun.org.apache.regexp.internal.RE;

public class TestB {
    public TestB(){
        System.out.println(RequestContext.getAdapterParam().toString());
    }
    public void speak(){

        System.out.println(" speak Hello!!!");
        RequestContext.setAdapterParam("你好！！！");
    }
}
