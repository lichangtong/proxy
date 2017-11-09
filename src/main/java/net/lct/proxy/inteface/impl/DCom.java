package net.lct.proxy.inteface.impl;

import net.lct.proxy.inteface.ICom;

public class DCom implements ICom {
    @Override
    public void preCheck() {
        System.out.println("DCom do preCheck");
    }

    @Override
    public void sayHello() {
        System.out.println("DCom do sayHello");
    }
}
