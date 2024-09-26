package com.cz;

import org.junit.Test;
import pojo.Account;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/*用户登录
* */
public class JDBCdemo5_userlogin {

 @Test
 public void testResult() throws Exception {
  //        注册驱动
//        Class.forName("com.mysql.jdbc.Driver");
//        获取连接
  String url = "jdbc:mysql://localhost:3306/db1?useSSL=false&useParameterizedStatement=true";
  String username = "root";
  String password = "123456";
  Connection conn = DriverManager.getConnection(url, username, password);

//  接受用户名和密码
//  String name = "zhangsan";
//  String pwd = "123";
//  sql注入演示
  String name = "adsadswd";
  String pwd = "' OR '1'='1";

//  String sql = "select * from user where username = '" + name + "' and password = '" + pwd + "'";
//  防注入
  String sql = "select * from user where username = ? and password = ?";

//  Statement stmt = conn.createStatement();
// 获取对象

  PreparedStatement pstmt = conn.prepareStatement(sql);
//  设置？的值
  pstmt.setString(1, name);
  pstmt.setString(2, pwd);


  ResultSet rs = pstmt.executeQuery();

//  看看登录成功了吗
if (rs.next()){
 System.out.println("登录成功");
}else {
 System.out.println("登录失败");
}

//释放资源
  rs.close();
  pstmt.close();
  conn.close();
 }

}
