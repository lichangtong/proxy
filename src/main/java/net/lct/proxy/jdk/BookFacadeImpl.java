package net.lct.proxy.jdk;

public class BookFacadeImpl implements BookFacade {
    @Override
    public int addBook() {
        System.out.println("这是实现类！！！");
        return 10;
    }
}
