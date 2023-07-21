package com.contacts.db;

public enum DbDetails {
    JDBC_URL("jdbc:postgresql://localhost:5432/shopme"),
    USERNAME("postgres"),
    PASSWORD("postgres");

    public final String label;

    DbDetails(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }


}
