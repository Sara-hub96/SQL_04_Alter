package org.example;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/newdb", "admin", "admin");
            Statement statement = conn.createStatement();

            statement.executeUpdate("ALTER TABLE students ADD country VARCHAR(30);");
            statement.executeUpdate("UPDATE student SET country = 'Italy' WHERE student_id IN (1,2);");
            statement.executeUpdate("UPDATE student SET country = 'Germany' WHERE student_id IN (3,4);");

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}