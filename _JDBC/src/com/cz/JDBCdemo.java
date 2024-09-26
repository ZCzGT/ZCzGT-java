package com.cz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*快速入门
* */
public class JDBCdemo {
    public static void main(String[] args) throws Exception {

//        注册驱动
//        Class.forName("com.mysql.jdbc.Driver");
//        获取连接
        String url = "jdbc:mysql://localhost:3306/db1?useSSL=false";
        String name = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, name, password);
//定义sql
        String sql = " update account set money = 2000 where id = 1;";
//    获取执行sql的对象
        Statement stmt = conn.createStatement();
//        执行sql
//        line 是影响的行数
        int line = stmt.executeUpdate(sql);
        System.out.println(line);

//        释放资源
        conn.close();
        stmt.close();

    }
}
