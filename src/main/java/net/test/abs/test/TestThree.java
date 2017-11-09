package net.test.abs.test;


import net.lct.proxy.inteface.ICom;
import net.lct.proxy.inteface.impl.DCom;

public class TestThree extends AbsClass {
    @Override
    protected ICom getSupperCom() {
        return new DCom();
    }

    @Override
    protected void preHandle() {
        System.out.println("TestThree preHandle");
    }

    @Override
    protected void postHandle() {
        System.out.println("TestThree postHandle");
    }
}
