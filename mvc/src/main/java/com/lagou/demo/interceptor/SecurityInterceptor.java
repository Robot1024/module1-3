package com.lagou.demo.interceptor;

import com.lagou.edu.mvcframework.interceptor.MyInterceptor;
import com.lagou.edu.mvcframework.pojo.Handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ascetic
 * @version 1.0
 * @ClassName SecurityInterceptor
 * @Description TODO
 * @date 2020-05-14 19:57
 */
public class SecurityInterceptor implements MyInterceptor {

    @Override
    public Boolean preHandler(HttpServletRequest request, HttpServletResponse response, Handler handler) {

        if(null == handler.getSecurityMapping().get(request.getParameter("username"))){
            return false;
        }
        if(handler.getSecurityMapping().get(request.getParameter("username"))==true){
            return true;
        }else {
            return false;
        }

    }
}