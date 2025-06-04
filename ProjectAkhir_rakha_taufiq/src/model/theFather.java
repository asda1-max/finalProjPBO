/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author A Z E R O T H
 */
import java.util.List;
public interface theFather {
    public List<movie> getDatas();
    public void insertData(movie mov);
    public void updateData(movie mov);
    public void deleteData(int id);
    
}
