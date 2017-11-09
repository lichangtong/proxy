package net.init.bean;

import org.springframework.beans.factory.InitializingBean;

public class People implements InitializingBean {
    private Integer pid;
    private String pname;

    public People() {
    }

    public People(Integer pid, String pname) {
        this.pid = pid;
        this.pname = pname;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("=============");
        System.out.println(this.toString());
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    @Override
    public String toString() {
        return "People{" +
                "pid=" + pid +
                ", pname='" + pname + '\'' +
                '}';
    }
}
