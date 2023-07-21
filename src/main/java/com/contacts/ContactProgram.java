package com.contacts;

import com.contacts.db.ConnectDb;

public class ContactProgram {

    public static void main(String[] args) {
        ConnectDb connectDb = new ConnectDb();
        connectDb.conn = connectDb.getConnection();

    }
}
