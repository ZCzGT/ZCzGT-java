package druid;

import com.alibaba.druid.pool.DruidDataSourceFactory;

 import javax.sql.DataSource;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Properties;

/*
*   Druid数据库连接池尝试
* */
public class druidDemo {
    public static void main(String[] args) throws Exception {
        //导入jar

//       配置文件 在文件夹下  druid.properties
//        加载配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("..\\_Jdbc\\src\\druid.properties"));
//        获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);

//        获取连接
        Connection connection = dataSource.getConnection();
        System.out.println(connection);


    }
}
