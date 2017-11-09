package net.test.abs;


import net.lct.proxy.inteface.ICom;
import net.lct.proxy.inteface.impl.BCom;

public class TestSupperClass extends AastractsSuperClass implements ICom {

    @Override
    protected ICom getSupperCom() {
        return new BCom();
    }

    @Override
    protected void preHandle() {

    }

    @Override
    protected void postHandle() {

    }

    @Override
    public void preCheck() {
        System.out.println("TestSupperClass preCheck");
    }

    @Override
    public void sayHello() {
        System.out.println("TestSupperClass sayHello");
    }
}
