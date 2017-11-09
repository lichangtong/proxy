package net.test.extents;

import org.springframework.beans.factory.InitializingBean;

public abstract class AbsClass implements InitializingBean {
    @Override
    public void afterPropertiesSet() throws Exception {
        speak();
    }

    public void speak() {
        System.out.println("-------------------------");
    }


}
