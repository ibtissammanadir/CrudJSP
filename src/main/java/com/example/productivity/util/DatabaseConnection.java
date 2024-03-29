package com.example.productivity.util;

import java.sql.Connection;
import java.sql.DriverManager;


public class DatabaseConnection {
    public Connection databaseLink;

    public  Connection  getConnection(){

        String databaseUser = "root";
        String databasePassword = "Bettybetty123-";
        String url ="jdbc:mysql://127.0.0.1:3306/user";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            databaseLink = DriverManager.getConnection(url, databaseUser,databasePassword);

        }catch(Exception e) {
            e.printStackTrace();
            e.getCause();
        }
        return  databaseLink;
    }
}
