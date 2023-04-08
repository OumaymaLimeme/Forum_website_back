package com.forum.enicarthage.serviceImpl;
import com.forum.enicarthage.dbutil.DButil;
import com.forum.enicarthage.services.UserService;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

@Service
public class UserServiceImpl implements UserService {
    Connection connection;
    int flag=0;
   public  UserServiceImpl() throws SQLException {
    connection = DButil.getConnection();
   }
    @Override
    public int loginValidation(String password, String username)  {
       try {
           PreparedStatement statement = connection.prepareStatement("SELECT * FROM  users.users WHERE usermail= '" + username + "'");
           ResultSet rs = statement.executeQuery();
           while (rs.next()){
               if(rs.getString(2).equals(password) && rs.getString(3).equals(username))
               { flag=1;}
               else {
                   System.out.println("Invalid username/password");
                   flag=0;
               }
           }
       }catch (SQLException e ){
           e.printStackTrace();
       }
       return  flag;
    }
}
