package net.test.abs;

import net.lct.proxy.inteface.ICom;
import net.lct.proxy.inteface.impl.BCom;

public class TestClass extends AastractsSuperClass implements ICom {
    @Override
    protected ICom getSupperCom() {
        return new BCom();
    }

    @Override
    protected void preHandle() {
        System.out.println("TestClass do method preHandle");
    }

    @Override
    protected void postHandle() {
        System.out.println("TestClass do method postHandle");
    }

    @Override
    public void preCheck() {
        System.out.println(" TestClass do preCheck");
    }

    @Override
    public void sayHello() {
        System.out.println("TestClass do sayHello");
    }
}
