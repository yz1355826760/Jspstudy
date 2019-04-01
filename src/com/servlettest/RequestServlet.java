package com.servlettest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "RequestServlet" )
public class RequestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        //设置请求编码格式
        req.setCharacterEncoding("utf-8");
        //设置响应编码格式
        res.getWriter().println("text/html; charset = utf-8");
        //获取请求信息
            //请求头数据

                //获取请求方式
                String method = req.getMethod();

                //获取请求URL
                StringBuffer URL = req.getRequestURL();

                //获取URI
                String URI = req.getRequestURI();

                //获取协议
                String scheme = req.getScheme();

            //获取请求行数据

                //获取指定行信息
                String header = req.getHeader("xxx");
                System.out.println(header);

                //获取所有请求行的键的枚举
                Enumeration e = req.getHeaderNames();
                while(e.hasMoreElements()){
                    String val = (String)e.nextElement();//调用nextElement方法获得元素
                    System.out.print(val);
                }
            //获取用户的数据
            req.getParameter("xxx");


        //处理请求信息
            //创建业务层对象
            //调用业务层对象的方法
        //响应处理结果
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//设置请求编码格式
        req.setCharacterEncoding("utf-8");
        //设置响应编码格式
        res.getWriter().println("text/html; charset = utf-8");
        //获取请求信息
        //请求头数据

        //获取请求方式
        String method = req.getMethod();

        //获取请求URL
        StringBuffer URL = req.getRequestURL();

        //获取URI
        String URI = req.getRequestURI();

        //获取协议
        String scheme = req.getScheme();

        //获取请求行数据

        //获取指定行信息
        String header = req.getHeader("xxx");
        System.out.println(header);

        //获取所有请求行的键的枚举
        Enumeration e = req.getHeaderNames();
        while(e.hasMoreElements()){
            String val = (String)e.nextElement();//调用nextElement方法获得元素
            System.out.print(val);
        }
        //获取用户的数据
        req.getParameter("xxx");
        //获取cookie信息数组
        Cookie cks[] = req.getCookies();
        for (Cookie c:cks){
            String name = c.getName();
            String value  = c.getValue();
            res.getWriter().write(name + ":" + value);
        }

        //处理请求信息
        //创建业务层对象
        //调用业务层对象的方法
        //响应处理结果
    }
}
