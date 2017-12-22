package net.spring.listener;

import net.test.context.RequestContext;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        RequestContext.initContext();

        //RequestContext.setAdapterParam(sce.getServletContext().getContextPath()+sce.getServletContext().getServletContextName());
        sce.getServletContext().setAttribute("test",sce.getServletContext().getContextPath()+sce.getServletContext().getServletContextName());
    }


    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
