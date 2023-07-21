package com.contacts.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDb {
    public String jdbcUrl = "jdbc:postgresql://localhost:5432/shopme";
    public String username = "postgres";
    public String password = "postgres";
    public Connection conn;

    {
        try {
            conn = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Connected to database");

            conn.close();
        } catch (SQLException e) {
            System.out.println("Error connecting to database");
            throw new RuntimeException(e);
        }
    }

    public Connection getConnection() {
        return conn;
    }
}
