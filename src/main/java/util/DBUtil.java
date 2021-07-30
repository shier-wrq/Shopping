package util;

import java.sql.*;

public class DBUtil {
    /**
     *测试
     public static void main(String[] args){
     try{
     DBUtil.getCon();
     System.out.println("连接成功");
     }catch(Exception e){
     System.out.println("连接失败");
     e.printStackTrace();
     }
     }
     **/
    private static final String URL = "jdbc:microsoft:sqlserver://localhost:1433;DatabaseName=UserFormation1";
    private static final String USERNAME = "shier";
    private static final String PWD = "Nyf@051214";
    static {
        try {
            Class.forName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
        }catch (ClassNotFoundException e){
            System.out.println("数据库初始化失败,请重新尝试");
            e.printStackTrace();
        }
    }
    public static Connection getCon() {
        Connection con = null;
        try {
            con = DriverManager.getConnection(URL, USERNAME, PWD);
        } catch (SQLException e) {
            System.out.println("连接失败，检查是否启动数据库");
            e.printStackTrace();
        }
        return con;
    }
    public static void closeALL(Connection con, PreparedStatement stmt, ResultSet rs){
        closeResult(rs);
        closeState(stmt);
        closeCon(con);
    }
    private static void closeCon(Connection con){
        if(null != con){
            try{
                con.close();
            }catch (SQLException e){
                System.out.println("关闭失败");
                e.printStackTrace();
            }
        }
    }
    private static void closeState(PreparedStatement stmt){
        if(null != stmt){
            try{
                stmt.close();
            }catch (SQLException e){
                System.out.println("关闭失败");
                e.printStackTrace();
            }
        }
    }
    private static void closeResult(ResultSet rs){
        if(null != rs){
            try{
                rs.close();
            }catch (SQLException e){
                System.out.println("关闭失败");
                e.printStackTrace();
            }
        }
    }
}
