package net.lct.proxy.inteface.impl;

import net.lct.proxy.inteface.ICom;

public class BCom implements ICom{
    @Override
    public void preCheck() {
        System.out.println("BCom do preCheck");
    }

    @Override
    public void sayHello() {
        System.out.println("BCom do sayHello");
    }
}
