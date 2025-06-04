/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author A Z E R O T H
 */
public class akun {
    private Integer id;
    private String user,password,telp;
    
    public void setData(int id, String user, String password, String telp){
        this.id = id;
        this.user = user;
        this.password = password;
        this.telp = telp;
    }
    
    public Integer getid(){
        return id;
    }
    public String getuser(){
        return user;
    }
    public String getpassword(){
        return password;
    }
    public String gettelp(){
        return telp;
    }
    
}
