/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Phan Quang
 */
public class PhongDaDat {
    private int id;
    private Date checkIn;
    private double gia;
    private double tongTien;
    private boolean nhanPhong;
    private String ghiChu;
    private PhongHat ph;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien(double tongTien) {
        this.tongTien = tongTien;
    }

    public boolean isNhanPhong() {
        return nhanPhong;
    }

    public void setNhanPhong(boolean nhanPhong) {
        this.nhanPhong = nhanPhong;
    }

    public String getGhiChu() {
        return ghiChu;
    }

    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }

    public PhongHat getPh() {
        return ph;
    }

    public void setPh(PhongHat ph) {
        this.ph = ph;
    }
    
    
}
