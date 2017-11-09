package net.test.abs.test;

public class TestMain {
    public static void main(String[] args) {
        AbsClass absClass = new TestOne();
        absClass.prepend(new TestTwo(),new TestThree());
        absClass.handle();
    }
}
