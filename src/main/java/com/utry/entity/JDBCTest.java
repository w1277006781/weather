package com.utry.entity;


import java.sql.*;

/**
 * Created by w1277006781 on 2018/9/14.
 */
public class JDBCTest {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        getPreparedStatement();
    }

    public static void getSelect() throws ClassNotFoundException, SQLException {
        //注册驱动
        Class.forName("oracle.jdbc.OracleDriver");
        //创建连接
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","root");

        //创建statement
        Statement statement = conn.createStatement();
        //书写sql
        String sql = "select * from student";
        //执行sql
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()){
            String string = resultSet.getString(1);
            String string1 = resultSet.getString(2);
            System.out.println(string+"---------"+string1);
        }

        //释放资源
        resultSet.close();
        statement.close();
        conn.close();
    }


    //
    public static void getPreparedStatement() throws ClassNotFoundException, SQLException {
        //注册驱动
        Class.forName("oracle.jdbc.OracleDriver");
        //创建链接
        Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "root");

        String sql  = "select * from student where id=?";
        PreparedStatement preparedStatement = conn.prepareStatement(sql);//预编译
        preparedStatement.setString(1,"1");

        ResultSet resultSet = preparedStatement.executeQuery();

        //结果集处理
        while (resultSet.next()){
            System.out.println("--------------preparedStatement--------");
            String string1 = resultSet.getString(1);
            String string = resultSet.getString(2);
            System.out.println(string+"---------"+string1);

        }
//

    }

}
