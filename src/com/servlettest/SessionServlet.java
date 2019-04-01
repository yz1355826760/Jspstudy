package com.servlettest;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class SessionServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("utf-8");
        resp.setContentType("text/html;charset = utf-8");
        //获取session/新建session   如果不存在就会新建一个  先获取才可以拿来用
        HttpSession session = req.getSession();
        //设置session的有效时间
        // session.getMaxInactiveInterval();
        //获取session的JESSISION编码
        System.out.println(session.getId());
        //销毁session
        //session.invalidate();
        String name = "张三";
        session.setAttribute("name",name);
        System.out.println("欢迎" + session.getAttribute("name"));//一定记得是“name”啊



    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
