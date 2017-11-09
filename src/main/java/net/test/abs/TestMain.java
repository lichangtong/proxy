package net.test.abs;

public class TestMain {
    public static void main(String[] args) {
        AastractsSuperClass aastractsSuperClass = new TestSupperClass();
        aastractsSuperClass.prepend(new TestClass(),new TestSupperClass());
        aastractsSuperClass.handle();
    }
}
