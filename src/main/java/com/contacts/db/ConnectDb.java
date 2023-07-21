package com.contacts.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDb {
    private String jdbcUrl = "jdbc:postgresql://localhost:5432/shopme";
    private String username = "postgres";
    private String password = "postgres";
    public Connection conn;

    {
        try {
            conn = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Connected to database");

        } catch (SQLException e) {
            System.out.println("Error connecting to database");
            throw new RuntimeException(e);
        }
    }

    public Connection getConnection() {
        return conn;
    }

    public void closeConnection() {
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println("Error closing connection");
            throw new RuntimeException(e);
        }
    }
}
