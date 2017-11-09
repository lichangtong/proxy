package net.test.abs.test;


import net.lct.proxy.inteface.ICom;
import net.lct.proxy.inteface.impl.BCom;

public class TestTwo extends AbsClass {
    @Override
    protected ICom getSupperCom() {
        return new BCom();
    }

    @Override
    protected void preHandle() {
        System.out.println("TestTwo preHandle");
    }

    @Override
    protected void postHandle() {
        System.out.println("TestTwo postHandlel");
    }
}
