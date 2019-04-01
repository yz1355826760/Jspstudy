package com.servlettest;

import org.apache.catalina.Server;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet(name = "sc" )
public class servletcontext extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //创建servletcontext对象
            //第一种：
            ServletContext sc1 = this.getServletContext();
            //第二种：
            ServletContext sc2 = this.getServletConfig().getServletContext();
            //第三种：
            ServletContext sc3 = req.getSession().getServletContext();

        //使用servletcontext完成数据共享
            //数据存储
            sc1.setAttribute("key","value");
            //数据获取
            Object o = sc1.getAttribute("key");
            System.out.println(o);

    }
}
