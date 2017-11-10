package net.init.bean;

import org.hibernate.validator.constraints.Length;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.format.annotation.NumberFormat;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

public class People implements InitializingBean {


    @NotNull(message = "不许为空")
    private Integer pid;
    @Pattern(regexp = "^[1-9]\\d*$", message = "数字")
    @Length(min = 3, max = 4, message = "家庭电话区号必须为3-4位数字")
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
