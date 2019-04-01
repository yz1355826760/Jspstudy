package com.servlettest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "ResponseServlet")
public class ResponseServlet extends HttpServlet {
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        //设置请求编码格式
        req.setCharacterEncoding("utf-8");
        //设置响应编码格式
        res.setContentType("text/html ; charset = utf-8");//设置响应给客户端的编码格式
        //设置响应头
        res.setHeader("张三","123456");//在响应头中添加响应消息，同键会覆盖

        res.addHeader("狗蛋","789123");//在响应头中添加响应消息，同键不会覆盖
        res.addHeader("李四","456789");
        //设置响应状态
        //res.sendError(404,"It'all fault you!!");
        //设置响应实体
        res.getWriter().write("你是个傻吊");
        //响应处理数据
            //创建cookie对象
            Cookie c = new Cookie("mouse","keyborad");
            //设置cookie的作用时效
            c.setMaxAge(3*3600*24);
            ////设置cookie的作用路径
            //c.setPath("RequestServlet");
        //响应cookie对象到客户端
            res.addCookie(c);



    }

    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//设置请求编码格式
        req.setCharacterEncoding("utf-8");
        //设置响应编码格式
        res.setContentType("text/html ; charset = utf-8");//设置响应给客户端的编码格式
        //设置响应头
        res.setHeader("张三","123456");//在响应头中添加响应消息，同键会覆盖

        res.addHeader("狗蛋","789123");//在响应头中添加响应消息，同键不会覆盖
        res.addHeader("李四","456789");
        //设置响应状态
        //res.sendError(404,"It'all fault you!!");
        //设置响应实体
        res.getWriter().write("你是个傻吊");
        //响应处理数据
        //创建cookie对象
        Cookie c = new Cookie("mouse","keyborad");
        //设置cookie的作用时效
        c.setMaxAge(3*3600*24);
        ////设置cookie的作用路径
        c.setPath("com.servlettest.RequestServlet");
        //响应cookie对象到客户端
        res.addCookie(c);
    }
}
