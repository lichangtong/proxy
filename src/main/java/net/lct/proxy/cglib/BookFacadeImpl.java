package net.lct.proxy.cglib;

public class BookFacadeImpl implements BookFacade {
    @Override
    public int addBook() {
        System.out.println("这是 cglib 实现增强行类");
        return 10;
    }
}
