package model.connector;
import java.sql.*;


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author A Z E R O T H
 */
public class berhubungan {
    private static String jdbc_driver = "com.mysql.cj.jdbc.Driver";
    private static String nama_db = "moviemanagement";
    private static String url_db = "jdbc:mysql://localhost:3306/" + nama_db;
    private static String username_db = "root";
    private static String password_db = "";

    static Connection hubung;
    
    public static Connection connect(){
        try {
            Class.forName(jdbc_driver);
            hubung = DriverManager.getConnection(url_db, username_db, password_db);
            System.out.println("MySQL Connected");
        } catch (ClassNotFoundException | SQLException exception) {
            // Menampilkan pesan error ketika MySQL gagal terhubung.
            System.out.println("Connection Failed: " + exception.getLocalizedMessage());
        }
        return hubung;
    }
    
    
}
