package com.cz;

import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/*statement
* */
public class JDBCdemo3_statement {
/*执行DML 就是增删改查
* */
 @Test
 public void testDML() throws Exception {
  //        注册驱动
//        Class.forName("com.mysql.jdbc.Driver");
//        获取连接
  String url = "jdbc:mysql://localhost:3306/db1?useSSL=false";
  String name = "root";
  String password = "123456";
  Connection conn = DriverManager.getConnection(url, name, password);
//定义sql
  String sql = " update account set money = 3000 where id = 1;";
//    获取执行sql的对象
  Statement stmt = conn.createStatement();
//        执行sql
//        line 是影响的行数
  int line = stmt.executeUpdate(sql);
  System.out.println(line);
  if (line > 0) {
   System.out.println("修改成功");
  } else {
   System.out.println("修改失败");
  }

//        释放资源
  conn.close();
  stmt.close();

 }

 /*执行DDL  表
  * */
 @Test
 public void testDDL() throws Exception {
  //        注册驱动
//        Class.forName("com.mysql.jdbc.Driver");
//        获取连接
  String url = "jdbc:mysql://localhost:3306/db1?useSSL=false";
  String name = "root";
  String password = "123456";
  Connection conn = DriverManager.getConnection(url, name, password);
//定义sql
  String sql = "drop database db2;";
//    获取执行sql的对象
  Statement stmt = conn.createStatement();
//        执行sql
//        line 是影响的行数
  int line = stmt.executeUpdate(sql); //可能返回0
  System.out.println(line);
  /*if (line > 0) {
   System.out.println("修改成功");
  } else {
   System.out.println("修改失败");
  }*/

//        释放资源
  conn.close();
  stmt.close();

 }
}
