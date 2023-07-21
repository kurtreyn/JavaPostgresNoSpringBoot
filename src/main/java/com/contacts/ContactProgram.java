package com.contacts;

import com.contacts.db.ConnectDb;
import com.contacts.db.ManageDb;

public class ContactProgram {

    public static void main(String[] args) {
        ConnectDb connectDb = new ConnectDb();
        ManageDb manageDb = new ManageDb();
        connectDb.conn = connectDb.getConnection();
        manageDb.addContact("", "", "");
//        manageDb.findContact("Kurt");
    }
}
