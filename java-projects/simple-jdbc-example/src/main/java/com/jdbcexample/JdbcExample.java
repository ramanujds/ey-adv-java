package com.jdbcexample;

import java.sql.*;
import java.time.LocalDate;

public class JdbcExample {
    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/ey_db";
        String username = "root";
        String password = "password";

        try {
            // Create Connection
            Connection conn = DriverManager.getConnection(url, username,password);
            System.out.println("Connection Successful");

//            // Create Statement
//            String sql = "select * from Persons";
//            PreparedStatement psmt = conn.prepareStatement(sql);
//
//            // Execute Query
//           ResultSet queryResult = psmt.executeQuery();
//
//           ResultSetMetaData metaData = psmt.getMetaData();
//
//           // Process ResultSet
////            while(queryResult.next()){
////                System.out.print(queryResult.getInt(1)+"\t");
////                System.out.print(queryResult.getString(2)+"\t");
////                System.out.print(queryResult.getString(3)+"\t");
////                System.out.print(queryResult.getString(4)+"\t");
////                System.out.print(queryResult.getString(5)+"\t");
////                System.out.print(queryResult.getString(6)+"\n");
////
////            }
//
//            for (int col=1; col<=metaData.getColumnCount(); col++){
//                System.out.print(metaData.getColumnLabel(col)+"\t");
//            }
//
//            System.out.println();
//            System.out.println("-------------------------------------------------------------------------------");
//
//            while(queryResult.next()){
//                for (int col=1; col<=metaData.getColumnCount(); col++){
//                    System.out.print(queryResult.getObject(col)+"\t");
//                }
//                System.out.println();
//            }

            // Insert Data

            int id = 15;
            String fName = "Varun";
            String lName = "Gupta";
            String address = "Jayanagar";
            String city = "Bangalore";
            LocalDate dob = LocalDate.parse("1992-10-10");

            String sql = "INSERT INTO Persons VALUES (?,?,?,?,?,?)";
            PreparedStatement psmt = conn.prepareStatement(sql);
            psmt.setInt(1,id);
            psmt.setString(2,lName);
            psmt.setString(3,fName);
            psmt.setString(4,address);
            psmt.setString(5,city);
            psmt.setString(6,dob.toString());

            int rowCount = psmt.executeUpdate();

            if(rowCount>0){
                System.out.println("New Record Inserted");
            }

        }
        catch (SQLException ex){
            System.err.println(ex.getMessage());
        }

    }
}
