package com.forum.enicarthage.dbutil;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DButil {
    private static Connection connection = null;

    public static Connection getConnection() throws SQLException {
        if (connection != null) {
            return connection;
        }
        else {
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/users?useSSL=false";
            String user = "root";
            String password = "Oumaymasamer54886508";
            try {
                Class.forName(driver);
                connection = DriverManager.getConnection(url, user, password);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            }
        }
            return  connection;

    }
}
