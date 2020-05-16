package com.lagou.edu.mvcframework.interceptor;

import com.lagou.edu.mvcframework.pojo.Handler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ascetic
 * @version 1.0
 * @InterfaceName interceptor
 * @Description penglei
 * @date 2020-05-14 19:52
 */
public interface MyInterceptor {

    public Boolean preHandler(HttpServletRequest request, HttpServletResponse response, Handler handler);

}
