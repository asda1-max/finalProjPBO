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

public class controlLoginReg {
    loginView loginpage;
    regView registerpage;

    theMother aksesObjekAkun;

    List<akun> daftarAkun;

    public controlLoginReg(loginView view) {
        this.loginpage = view;
        this.aksesObjekAkun = new aksesObjekAkun();
    }

    public controlLoginReg(regView regView) {
        this.registerpage = regView;
        this.aksesObjekAkun = new aksesObjekAkun();
    }

    public int checkUsername(String username, String pw) {
        daftarAkun = aksesObjekAkun.getDatas();
        for (akun akunObj : daftarAkun) {
            if (akunObj.getuser().equals(username) && akunObj.getpassword().equals(pw)) {
                if (username.equals("admin") && pw.equals("admin123")) {
                    return 2; // Admin user
                } else {
                    return 1; // Regular user
                }
            }
        }
        return 0; // No matching data
    }

    public boolean registerNewAkun(String username, String pw, String telp) {
        daftarAkun = aksesObjekAkun.getDatas();
        for (akun akunObj : daftarAkun) {
            if (akunObj.getuser().equals(username)) {
                return false; // Username already exists
            }
        }
        akun newAkun = new akun();
        newAkun.setData(0, username, pw, telp);
        aksesObjekAkun.insertData(newAkun); // Use insertData method to add to database
        return true; // Registration successful
    }
}
