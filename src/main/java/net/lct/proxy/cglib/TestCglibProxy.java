package net.lct.proxy.cglib;

public class TestCglibProxy {
    public static void main(String[] args) {
        System.out.println("cglig 测试代理！！！");

        BookFacadeProxy bookFacadeProxy = new BookFacadeProxy();
        BookFacadeImpl bookFacade = (BookFacadeImpl) bookFacadeProxy.getInstance(new BookFacadeImpl());
        int rv = bookFacade.addBook();
        System.out.println("result = " + rv);
    }
}
