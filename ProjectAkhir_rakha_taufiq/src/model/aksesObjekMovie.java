/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.connector.berhubungan;

/**
 *
 * @author A Z E R O T H
 */
public class aksesObjekMovie implements theFather {
    
    @Override
    public List<movie> getDatas() {
        List<movie> listmovie = null;
        try {
            listmovie = new ArrayList<>();
            Statement sta = berhubungan.connect().createStatement();
            String q = "Select * FROM movies";
            ResultSet result = sta.executeQuery(q);
            while (result.next()) {
                movie mov = new movie();
                int intID = result.getInt("movie_id");
                int dura = result.getInt("movie_duration");
                String nama = result.getString("movie_name");
                String sche = result.getString("movie_schedule");
                String desc = result.getString("movie_description");
                
                mov.setData(intID, nama, desc, sche, dura);
                listmovie.add(mov);
            }
            sta.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return listmovie;
    }

    @Override
    public void insertData(movie mov) {
        try {
            String q = "INSERT INTO movies (movie_name, movie_duration, movie_description, movie_schedule) VALUES (?, ?, ?, ?)";
            PreparedStatement ps = berhubungan.connect().prepareStatement(q);
            ps.setString(1, mov.getname());
            ps.setInt(2, mov.getduration());
            ps.setString(3, mov.getdescription());
            ps.setString(4, mov.getSchedule());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void updateData(movie mov) {
        try {
            String q = "UPDATE movies SET movie_name = ?, movie_duration = ?, movie_description = ?, movie_schedule = ? WHERE movie_id = ?";
            PreparedStatement ps = berhubungan.connect().prepareStatement(q);
            ps.setString(1, mov.getname());
            ps.setInt(2, mov.getduration());
            ps.setString(3, mov.getdescription());
            ps.setString(4, mov.getSchedule());
            ps.setInt(5, mov.getid());
            ps.executeUpdate();
            ps.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void deleteData(int id) {
        try {
            String q = "DELETE FROM movies WHERE movie_id = ?";
            PreparedStatement ps = berhubungan.connect().prepareStatement(q);
            ps.setInt(1, id);
            ps.executeUpdate();
            ps.close();
            System.out.println("woi" + id);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
