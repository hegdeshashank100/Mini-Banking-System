/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banking.system;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author hegde
 */
public class Database {
    String jdbcDriver ="";
    String dburl = "";
    String username = "";
    String password = "";
    Connection connection;
  
    
    public Database() throws ClassNotFoundException, SQLException
    {
        jdbcDriver ="com.mysql.jdbc.Driver";
        dburl = "jdbc:mysql://localhost:3307/banking";
        username = "root";
        password = "root"; 
        
        // set a java database connectivity
        Class.forName(jdbcDriver);
        
        connection = DriverManager.getConnection(dburl,username,password);
        
    }
    
    public ResultSet executeQuery(String query) throws SQLException
    {
        PreparedStatement st = connection.prepareStatement(query);
        return st.executeQuery();
    }
    public int executeUpdate(String statement) throws SQLException
    {
        PreparedStatement st = connection.prepareStatement(statement);
        return st.executeUpdate();
    }
   
    
}
