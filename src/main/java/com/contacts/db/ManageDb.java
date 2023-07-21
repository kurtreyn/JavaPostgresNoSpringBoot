package com.contacts.db;

import java.sql.Connection;
import java.sql.Statement;

public class ManageDb {
    Connection conn = null;
    Statement stmt = null;
    ConnectDb connectDb = new ConnectDb();

    public ManageDb() {
        ConnectDb connectDb = new ConnectDb();
    }



    public void addContact(String firstName, String lastName, String email) {
//        ConnectDb connectDb = new ConnectDb();

        try {
            conn = connectDb.getConnection();
            stmt = conn.createStatement();
            String sql = "INSERT INTO contacts (first_name, last_name, email) VALUES ('" + firstName + "','" + lastName + "','" + email + "')";
            stmt.executeUpdate(sql);
            System.out.println("Contact added successfully");
        } catch (Exception e) {
            System.out.println("Error adding contact");
            throw new RuntimeException(e);
        } finally {
            try {
                stmt.close();
                conn.close();
            } catch (Exception e) {
                System.out.println("Error closing connection");
                throw new RuntimeException(e);
            }
        }
    }

    public void findContact(String firstName) {

//        ConnectDb connectDb = new ConnectDb();

        try {
            conn = connectDb.getConnection();
            stmt = conn.createStatement();
            String sql = "SELECT * FROM contacts WHERE first_name = '" + firstName + "'";
            stmt.executeUpdate(sql);
            System.out.println("Contact found successfully");
        } catch (Exception e) {
            System.out.println("Error finding contact");
            throw new RuntimeException(e);
        } finally {
            try {
                stmt.close();
                conn.close();
            } catch (Exception e) {
                System.out.println("Error closing connection");
                throw new RuntimeException(e);
            }
        }
    }


}
