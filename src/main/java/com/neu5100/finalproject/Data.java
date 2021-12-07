/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu5100.finalproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author An
 */
public class Data {
    static final String USER = "root";
    static final String PASS = "123456";
    static Statement stmt=null;
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ecosystem",USER,PASS);
            stmt = conn.createStatement();
            String sql = "select * from test";
            ResultSet result = stmt.executeQuery(sql);
            while(result.next()){
                int id = result.getInt("idtest");
                String name = result.getString("name");
                System.out.println(id+" "+name);
                        
            }
        } catch (Exception ex) {
            Logger.getLogger(Data.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
