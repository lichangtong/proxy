package net.lct.proxy.inteface.impl;

import net.lct.proxy.inteface.ICom;

public class ACom implements ICom {
    @Override
    public void preCheck() {
        System.out.println("ACom do preCheck");
    }

    @Override
    public void sayHello() {
        System.out.println("ACom do sayHello");
    }
}
