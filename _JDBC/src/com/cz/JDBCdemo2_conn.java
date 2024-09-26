package com.cz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/*事务操作
* */
public class JDBCdemo2_conn {
    public static void main(String[] args) throws Exception {

//        注册驱动
//        Class.forName("com.mysql.jdbc.Driver");
//        获取连接
        String url = "jdbc:mysql://localhost:3306/db1?useSSL=false";
        String name = "root";
        String password = "123456";
        Connection conn = DriverManager.getConnection(url, name, password);
//定义sql
        String sql1 = " update account set money = 3000 where id = 1;";
        String sql2 = " update account set money = 3000 where id = 2;";
//    获取执行sql的对象
        Statement stmt = conn.createStatement();
//        执行sql
//        line 是影响的行数

//        开启事务

        try {
            //        开启事务
            conn.setAutoCommit(false);

            int line1 = stmt.executeUpdate(sql1);
            System.out.println(line1);
            int a = 3/0;
            int line2 = stmt.executeUpdate(sql2);
            System.out.println(line2);

            //        提交事务
            conn.commit();
        } catch (Exception e) {
//            出现异常了回滚事务
            conn.rollback();
            throw new RuntimeException(e);
        }



//        释放资源
        conn.close();
        stmt.close();

    }
}
