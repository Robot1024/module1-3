package com.lagou.demo.controller;

import com.lagou.demo.service.IDemoService;
import com.lagou.edu.mvcframework.annotations.LagouAutowired;
import com.lagou.edu.mvcframework.annotations.LagouController;
import com.lagou.edu.mvcframework.annotations.LagouRequestMapping;
import com.lagou.edu.mvcframework.annotations.Security;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@LagouController
@LagouRequestMapping("/demo")
@Security({"zhangsan"})
public class DemoController {


    @LagouAutowired
    private IDemoService demoService;


    /**
     * URL: /demo/query?name=lisi
     * @param request
     * @param response
     * @param username
     * @return
     *
     * localhost:8080/demo/handle01?username=zhangsan
     */
    @LagouRequestMapping("/handle01")
    @Security({"liSi"})
    public void query(HttpServletRequest request, HttpServletResponse response,String username) throws IOException {
        ServletOutputStream out = response.getOutputStream();
        out.println(demoService.get(username));
        out.flush();
        out.close();

    }
}
