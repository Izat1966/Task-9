package org.example;

import java.sql.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Connection conn;

        String url = "jdbc:postgresql:postgres"; // testdb is a name of database
        String username = "postgres";
        String password = "123456";

        try {
            conn = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to Database.");
        }
        catch(SQLException e){
            System.out.println(e.toString());
        }
    }
    String sql = "SELECT * FROM instructor";
}