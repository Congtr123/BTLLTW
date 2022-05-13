/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package murach.business;

/**
 *
 * @author BENH VIEN CONG NGHE
 */


import java.io.Serializable;

import java.io.Serializable;

public class User implements Serializable {
    private String hoten;
    private String sdt;
    private String cccd;
    private String diachi;
    private String email;
    private String namsinh;      
    
    public User() {
        hoten = "";
        sdt = "";
        cccd = "";
        diachi = "";
        email = "";
        namsinh = "";
    }
    
    public User(String hoten, String sdt, String cccd) {
        this.hoten = hoten;
        this.sdt = sdt;
        this.email = cccd;
        this.diachi=diachi;
        this.email=email;
        this.namsinh=namsinh;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getCccd() {
        return cccd;
    }

    public void setCccd(String cccd) {
        this.cccd = cccd;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNamsinh() {
        return namsinh;
    }

    public void setNamsinh(String namsinh) {
        this.namsinh = namsinh;
    }
    
}
