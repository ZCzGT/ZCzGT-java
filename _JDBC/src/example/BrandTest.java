package example;

import com.alibaba.druid.pool.DruidDataSourceFactory;
import org.junit.Test;
import pojo.Brand;

import javax.sql.DataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/*
* 品牌数据的增删改查
* */
public class BrandTest {
/*
*   查询所有
* */
    @Test
    public void testSelectAll() throws Exception {
        //       配置文件 在文件夹下  druid.properties
//        加载配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("..\\_Jdbc\\src\\druid.properties"));
//        获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);

//        获取连接
        Connection conn = dataSource.getConnection();
        String sql = "select * from tb_brand";

//        stmt对象
        PreparedStatement pstmt = conn.prepareStatement(sql);
//        设置参数
//        这里无需

//        执行sql
        ResultSet rs = pstmt.executeQuery();

//        处理结果
        List<Brand> list = new ArrayList<>();
        while (rs.next()){
            int id = rs.getInt("id");
            String brandName = rs.getString("brand_name");
            String companyName = rs.getString("company_name");
            int ordered = rs.getInt("ordered");
            String description = rs.getString("description");
            int status = rs.getInt("status");
            Brand brand = new Brand();
            brand.setId(id);
            brand.setBrandName(brandName);
            brand.setCompanyName(companyName);
            brand.setOrdered(ordered);
            brand.setDescription(description);
            brand.setStatus(status);
            list.add(brand);

        }

        System.out.println(list);

//        释放
    rs.close();
    pstmt.close();
    conn.close();
    }

    /*
     *   添加数据
     * */
    @Test
    public void testadd() throws Exception {
//        模拟一些对象
        String brandName = "香喷喷";
        String companyName = "香喷喷公司";
        int ordered = 90;
        String description = "香喷喷good";
        int status = 1;

        //       配置文件 在文件夹下  druid.properties
//        加载配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("..\\_Jdbc\\src\\druid.properties"));
//        获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);

//        获取连接
        Connection conn = dataSource.getConnection();
//        无需id，数据库会自动生成
        String sql = "insert into tb_brand (brand_name,company_name,ordered,description,status) values (?,?,?,?,?)";

//        stmt对象
        PreparedStatement pstmt = conn.prepareStatement(sql);
//        设置参数
        pstmt.setString(1, brandName);
        pstmt.setString(2,companyName);
        pstmt.setInt(3,ordered);
        pstmt.setString(4,description);
        pstmt.setInt(5,status);


//        执行sql
        int l = pstmt.executeUpdate();
       boolean b = l>0;

        System.out.println(b);

        //        释放
        pstmt.close();
        conn.close();
        }

    /*
     *   修改数据
     * */
    @Test
    public void testupdate() throws Exception {
//        模拟把对象
        String brandName = "香喷喷";
        String companyName = "香喷喷公司";
        int ordered = 1000;
        String description = "香喷喷goodgood";
        int status = 1;
        int id = 4;

        //       配置文件 在文件夹下  druid.properties
//        加载配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("..\\_Jdbc\\src\\druid.properties"));
//        获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);

//        获取连接
        Connection conn = dataSource.getConnection();
//        无需id，数据库会自动生成
        String sql = "update tb_brand " +
                "set brand_name = ?," +
                "company_name = ?," +
                "ordered = ?," +
                "description = ?," +
                "status = ? " +
                "where id = ?";

//        stmt对象
        PreparedStatement pstmt = conn.prepareStatement(sql);
//        设置参数
        pstmt.setString(1, brandName);
        pstmt.setString(2,companyName);
        pstmt.setInt(3,ordered);
        pstmt.setString(4,description);
        pstmt.setInt(5,status);
        pstmt.setInt(6,id);


//        执行sql
        int l = pstmt.executeUpdate();
        boolean b = l>0;

        System.out.println(b);

        //        释放
        pstmt.close();
        conn.close();
    }

    /*
     *   删除数据
     * byid
     * */
    @Test
    public void testdelete() throws Exception {
//        模拟把对象

        int id = 17;

        //       配置文件 在文件夹下  druid.properties
//        加载配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("..\\_Jdbc\\src\\druid.properties"));
//        获取连接池对象
        DataSource dataSource = DruidDataSourceFactory.createDataSource(properties);

//        获取连接
        Connection conn = dataSource.getConnection();
//        无需id，数据库会自动生成
        String sql = "delete from tb_brand where id = ?";

//        stmt对象
        PreparedStatement pstmt = conn.prepareStatement(sql);
//        设置参数
        pstmt.setInt(1,id);


//        执行sql
        int l = pstmt.executeUpdate();
        boolean b = l>0;

        System.out.println(b);

        //        释放
        pstmt.close();
        conn.close();
    }


}
