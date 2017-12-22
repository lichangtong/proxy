package net.spring.web.controller;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContextAware;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.ServletConfigAware;
import org.springframework.web.context.ServletContextAware;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/web/hello")
public class HelloController implements ServletConfigAware, ServletContextAware {
    private ServletContext servletContext = null;
    private ServletConfig servletConfig = null;

    @ResponseBody
    @RequestMapping("/sayHello")
    public String sayHello(HttpServletRequest request) {

        System.out.println("Say hello everyone！！！");
        // System.out.println(RequestContext.getAdapterParam().toString());
        //System.out.println(request.getServletContext().getAttribute("test"));
        System.out.println(servletConfig.getServletContext().getAttribute("test")+"=============");
        System.out.println(servletContext.getAttribute("test")+"---------------");


        return "hello";
    }

    @Override
    public void setServletConfig(ServletConfig servletConfig) {
        this.servletConfig = servletConfig;
    }

    @Override
    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;

    }
}
