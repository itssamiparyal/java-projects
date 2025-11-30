package org.example;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;

public class ConnectDatabase {
    public static void connect(){
        Connection conn = null;
        try{
            String url = "jdbc:sqlite:test.db";
            conn = DriverManager.getConnection(url);
            System.out.println("Connection Established!");
        }
        catch(SQLException e){
            System.out.println("Connection failed");
            System.out.println(e.getMessage());
        }

    }

    public static void main(String[] args) {
        connect();
    }
}
