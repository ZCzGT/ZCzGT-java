package com.cz;

import org.junit.Test;
import pojo.Account;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/*statement resultSet
* */
public class JDBCdemo4_stmt_resultSet {
/*执行DQL
* */
 @Test
 public void testResult() throws Exception {
  //        注册驱动
//        Class.forName("com.mysql.jdbc.Driver");
//        获取连接
  String url = "jdbc:mysql://localhost:3306/db1?useSSL=false";
  String username = "root";
  String password = "123456";
  Connection conn = DriverManager.getConnection(url, username, password);

  //        定义sql
  String sql = "select * from account";
  //        获取执行sql的对象
  Statement stmt = conn.createStatement();
//  执行sql
  ResultSet rs = stmt.executeQuery(sql);

  //        处理结果
//  re.next相当于游标 从上倒下 有数据true
  while (rs.next()) {
//   获取数据
//   index 从1开始
 /*  int id = rs.getInt(1);
   String name = rs.getString(2);
   double money = rs.getDouble(3);*/
     int id = rs.getInt("id");
   String name = rs.getString("name");
   double money = rs.getDouble("money");
   System.out.println(id+"\t"+name+"\t"+money);
   System.out.println("-------------------");

  }
  //        释放资源
  rs.close();
  stmt.close();
  conn.close();

 }

 /*数据封装到Acount中 并且存储到ArrayList集合中
  * */
 @Test
 public void testResult2() throws Exception {
  //        注册驱动
//        Class.forName("com.mysql.jdbc.Driver");
//        获取连接
  String url = "jdbc:mysql://localhost:3306/db1?useSSL=false";
  String username = "root";
  String password = "123456";
  Connection conn = DriverManager.getConnection(url, username, password);

  //        定义sql
  String sql = "select * from account";
  //        获取执行sql的对象
  Statement stmt = conn.createStatement();
//  执行sql
  ResultSet rs = stmt.executeQuery(sql);

  List<Account> list = new ArrayList<>();

  //        处理结果
//  re.next相当于游标 从上倒下 有数据true
  while (rs.next()) {
//   获取数据
//   index 从1开始
   Account account = new Account();
   int id = rs.getInt("id");
   String name = rs.getString("name");
   double money = rs.getDouble("money");
   account.setId(id);
   account.setName(name);
   account.setMoney(money);
   list.add(account);

  }
  System.out.println(list);
  //        释放资源
  rs.close();
  stmt.close();
  conn.close();

 }

}
