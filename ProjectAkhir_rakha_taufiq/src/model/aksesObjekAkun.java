/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

import model.connector.*;

/**
 *
 * @author A Z E R O T H
 */
public class aksesObjekAkun implements theMother{

    @Override
    public List<akun> getDatas() {
        List<akun> listAkun = null;
        try {
            listAkun = new ArrayList<>();
            Statement sta = berhubungan.connect().createStatement();
            String q = "Select * FROM users";
            ResultSet result = sta.executeQuery(q);
            while (result.next()) {
                akun ak = new akun();
                int intID = result.getInt("id");
                String user = result.getString("user");
                String password = result.getString("password");
                String telp = result.getString("telp");
                
                ak.setData(intID, user, password, telp);
                listAkun.add(ak);
            }
            sta.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listAkun;
    }

    @Override
    public void insertData(akun ak) {
        try {
            String q = "INSERT INTO users (user, password, telp) VALUES (?, ?, ?)";
            PreparedStatement ps = berhubungan.connect().prepareStatement(q);
            ps.setString(1, ak.getuser());
            ps.setString(2, ak.getpassword());
            ps.setString(3, ak.gettelp());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
}
