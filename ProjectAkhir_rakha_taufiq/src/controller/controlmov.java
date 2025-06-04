/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

/**
 *
 * @author A Z E R O T H
 */

import java.util.List;
import view.*;
import model.*;

public class controlmov {
    public viewAdmin adminpage;
    public viewUser userpage;
    public updatemovie updatepage;
    public inputMovie inputpage;
    public bookView bookpage;
    
    theFather aksesObjekMovie;
    
    List<movie> daftarMovie;
    
    public controlmov(viewAdmin view) {
        this.adminpage = view;
        this.aksesObjekMovie = new aksesObjekMovie();
    }

    public controlmov(viewUser view) {
        this.userpage = view;
        this.aksesObjekMovie = new aksesObjekMovie();
    }
    
    public controlmov(updatemovie view) {
        this.updatepage = view;
        this.aksesObjekMovie = new aksesObjekMovie();
    }
    public controlmov(inputMovie view) {
        this.inputpage = view;
        this.aksesObjekMovie = new aksesObjekMovie();
    }
    
    public controlmov(bookView view) {
        this.bookpage = view;
        this.aksesObjekMovie = new aksesObjekMovie();
    }
    
    public void showAllMovieuser() {
        List<movie> daftarMovie = aksesObjekMovie.getDatas();
        userpage.tampilkanDataMovie(daftarMovie);
    }

    public void showAllMovieadmin() {
        List<movie> daftarMovie = aksesObjekMovie.getDatas();
        adminpage.tampilkanDataMovie(daftarMovie);
    }

    public void updateMovie(movie updatedMovie) {
        aksesObjekMovie.updateData(updatedMovie);
    }
    
    public void dataSelected(int id, String nama, int dura, String Desc, String Sche){
        movie mov = new movie();
        mov.setData(id, nama, Desc, Sche, dura);
        updatepage.getmovie(mov);
    }
    
    public void inputData(String nama, int dura, String Desc, String Sche){
        movie mov = new movie();
        mov.setData(0, nama, Desc, Sche, dura);
        aksesObjekMovie.insertData(mov);
    }
    
    public void delete(int id){
        aksesObjekMovie.deleteData(id);
    }
    
    public void bookViews(String title,int duration,String description, String Schedule, String username){
        bookView buk = new bookView();
        buk.bookset(title, duration, description, Schedule, username);
        buk.setVisible(true);
    }
}
