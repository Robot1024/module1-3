package com.lagou.edu.mvcframework.pojo;

import com.lagou.edu.mvcframework.interceptor.MyInterceptor;

import javax.sound.midi.MetaEventListener;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;


/**
 * 封装handler方法相关的信息
 */
public class Handler {

    private Object controller; // method.invoke(obj,)

    private Method method;

    private Pattern pattern; // spring中url是支持正则的

    private Map<String,Integer> paramIndexMapping; // 参数顺序,是为了进行参数绑定，key是参数名，value代表是第几个参数 <name,2>


    private Map<String,Boolean> securityMapping;// 存储Handler 下有哪些用户的访问权限

    private List<MyInterceptor> myInterceptorList; // 拦截器链



    public Handler(Object controller, Method method, Pattern pattern) {
        this.controller = controller;
        this.method = method;
        this.pattern = pattern;
        this.paramIndexMapping = new HashMap<>();
        this.securityMapping = new HashMap<>();
        this.myInterceptorList = new ArrayList<>();
    }

    public List<MyInterceptor> getMyInterceptorList() {
        return myInterceptorList;
    }

    public void setMyInterceptorList(List<MyInterceptor> myInterceptorList) {
        this.myInterceptorList = myInterceptorList;
    }

    public Map<String, Boolean> getSecurityMapping() {
        return securityMapping;
    }

    public void setSecurityMapping(Map<String, Boolean> securityMapping) {
        this.securityMapping = securityMapping;
    }

    public Object getController() {
        return controller;
    }

    public void setController(Object controller) {
        this.controller = controller;
    }

    public Method getMethod() {
        return method;
    }

    public void setMethod(Method method) {
        this.method = method;
    }

    public Pattern getPattern() {
        return pattern;
    }

    public void setPattern(Pattern pattern) {
        this.pattern = pattern;
    }

    public Map<String, Integer> getParamIndexMapping() {
        return paramIndexMapping;
    }

    public void setParamIndexMapping(Map<String, Integer> paramIndexMapping) {
        this.paramIndexMapping = paramIndexMapping;
    }
}
