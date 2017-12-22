package net.test.context;

import java.lang.reflect.InvocationTargetException;

public class TestA {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        RequestContext.initContext();
        Object to = RequestContext.getAdapterParam();
        System.out.println(to);
        TestB testB = new TestB();
        testB.speak();

        TestC  testC = new  TestC();
        testC.sayHello();
    }
}
