package net.spring.interceptor;

import net.test.context.RequestContext;
import org.springframework.lang.Nullable;
import org.springframework.ui.ModelMap;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.context.request.WebRequestInterceptor;

public class MyWebRequestInterceptor implements WebRequestInterceptor {

    @Override
    public void preHandle(WebRequest request) throws Exception {
       // RequestContext.initContext();

        //System.out.println(RequestContext.getAdapterParam());
    }


    @Override
    public void postHandle(WebRequest request, @Nullable ModelMap model) throws Exception {

    }


    @Override
    public void afterCompletion(WebRequest request, @Nullable Exception ex) throws Exception {
        RequestContext.remove();
    }
}
