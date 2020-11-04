package com.zx.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet01  extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //取得url-pattern
        String path = request.getServletPath();
        System.out.println(path);
        if("/studentSave.do".equals(path)){
            System.out.println("this way is to save");
        }
        System.out.println(11);
    }
}
