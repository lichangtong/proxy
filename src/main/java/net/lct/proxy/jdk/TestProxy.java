package net.lct.proxy.jdk;

public class TestProxy {
    public static void main(String[] args) {
        BookFacadeProxy proxy = new BookFacadeProxy();
        BookFacade bookProxy = (BookFacade) proxy.bind(new BookFacadeImpl());
        int rv = bookProxy.addBook();
        System.out.println("result = " + rv);
    }
}
