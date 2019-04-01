package com.servlettest;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import java.io.IOException;

@WebServlet(name = "sc")
public class ServletConfigServlet extends HttpServlet {
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        //获取servletconfig对象
        ServletConfig sc = new com.servlettest.ServletConfigServlet();
        //获取web.xml中的配置数据
        String code = getInitParameter("hello");
        res.getWriter().write(code);
    }
}
