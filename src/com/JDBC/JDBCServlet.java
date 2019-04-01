package com.JDBC;

import com.mysql.cj.MysqlConnection;
import com.sun.deploy.jardiff.JarDiff;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@WebServlet(name = "JDBCServlet")
public class JDBCServlet extends HttpServlet {
    public static void main(String[] args) throws ClassNotFoundException {
        //声明connection对象
        Connection connection;
        //驱动程序名
        String driver = "com.mysql.jdbc.Driver";
        //URL指向要访问的数据库名mydata
        String url = "jdbc:mysql://localhost:3306/register?serverTimezone=UTC";
        //MySQL配置时的用户名
        String user = "root";
        //MySQL配置时的密码
        String pwd = "yz1355826760";
        try {
            //加载驱动程序
            Class.forName(driver);
            //1.getConnection()方法，连接MySQL数据库
            connection = DriverManager.getConnection(url,user,pwd);
            if (!connection.isClosed()){
                System.out.println("数据库连接成功");
            }
            //2.创建statement类对象，用来执行SQL语句
            Statement statement = connection.createStatement();
            //要执行的SQL语句
            String sql = "select * from customer";
            //3.ResultSet类，用来存放获取的结果集
            ResultSet resultSet = statement.executeQuery(sql);
            System.out.println("-----------------");
            System.out.println("执行结果如下所示:");
            System.out.println("-----------------");
            System.out.println("姓名" + "\t" + "\t"+ "密码");
            System.out.println("-----------------");

            String uname = null;
            String upwd = null;
            while (resultSet.next()){
                //获取列的数据
                uname = resultSet.getString("uname");
                upwd = resultSet.getString("upwd");
                //输出结果
                System.out.println(uname + "\t" + upwd);
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("-----------------");
            System.out.println("数据库数据成功获取");
        }
    }
}
