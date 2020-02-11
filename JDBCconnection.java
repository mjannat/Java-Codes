package com.rosetta;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JDBCconnection {

    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your ID:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter your Name:");
        String name = sc.nextLine();
        System.out.println("Enter your Email:");
        String email = sc.nextLine();
        try {
            String url = "jdbc:mysql://localhost:3306/mydb";
            String user = "root";
            String pass = "";

            String query = "insert into employee values(?,?,?)";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = (Connection) DriverManager.getConnection(url, user, pass);
            PreparedStatement pst = con.prepareStatement(query);
            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setString(3, email);
            int value;
            value = pst.executeUpdate();
            if (value > 0) {
                System.out.println("Insert Success");
            } else {
                System.out.println("Insert Fail");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.getMessage();
        }
    }

}
