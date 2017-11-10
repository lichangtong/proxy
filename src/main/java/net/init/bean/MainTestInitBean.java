package net.init.bean;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class MainTestInitBean {
    public static void main(String[] args) {
//        People people = new People(10001, "李四");
//        System.out.println( people.toString());

//        ApplicationContext factory=new FileSystemXmlApplicationContext("classpath:application.xml");
        //People people = (People) factory.getBean(People.class.getName());
        //System.out.println(people.toString());

        People people = new People(null,"1001");
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        Validator validator = factory.getValidator();

        Set<ConstraintViolation<People>> constraintViolationspname =  validator.validateProperty(people,"pname");
        Set<ConstraintViolation<People>> constraintViolationspid =  validator.validateProperty(people,"pid");
        //assertEquals(1, constraintViolations.size());
        System.out.println(constraintViolationspid);
        System.out.println(constraintViolationspname);
    }
}
