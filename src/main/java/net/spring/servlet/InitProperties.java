package net.spring.servlet;

import org.springframework.web.context.ContextLoaderListener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class InitProperties extends ContextLoaderListener {
    /**
     */
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        sce.getServletContext().setSessionTimeout(60000);
        sce.getServletContext().setRequestCharacterEncoding("utf-8");
        sce.getServletContext().setResponseCharacterEncoding("utf-8");

    }

    /**
     * Receives notification that the ServletContext is about to be
     * shut down.
     * <p>
     * <p>All servlets and filters will have been destroyed before any
     * ServletContextListeners are notified of context
     * destruction.
     *
     * @param sce the ServletContextEvent containing the ServletContext
     *            that is being destroyed
     * @implSpec The default implementation takes no action.
     */
    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
