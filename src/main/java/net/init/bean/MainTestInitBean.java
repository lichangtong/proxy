package net.init.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class MainTestInitBean {
    public static void main(String[] args) {
//        People people = new People(10001, "李四");
//        System.out.println( people.toString());

        ApplicationContext factory=new FileSystemXmlApplicationContext("classpath:application.xml");
        //People people = (People) factory.getBean(People.class.getName());
        //System.out.println(people.toString());
    }
}
