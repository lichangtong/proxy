package net.test.abs.test;

import net.lct.proxy.inteface.ICom;
import net.lct.proxy.inteface.impl.ACom;

public class TestOne extends AbsClass {
    @Override
    protected ICom getSupperCom() {
        return new ACom();
    }

    @Override
    protected void preHandle() {
        System.out.println("TestOne preHandle");
    }

    @Override
    protected void postHandle() {
        System.out.println("TestOne postHandle");
    }
}
