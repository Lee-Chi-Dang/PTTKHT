/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Phan Quang
 */
public class MatHangHoaDon {
    private int id;
    private HoaDon hoaDon;
    private MatHangDaNhap matHangDaNhap;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HoaDon getHoaDon() {
        return hoaDon;
    }

    public void setHoaDon(HoaDon hoaDon) {
        this.hoaDon = hoaDon;
    }

    public MatHangDaNhap getMatHangDaNhap() {
        return matHangDaNhap;
    }

    public void setMatHangDaNhap(MatHangDaNhap matHangDaNhap) {
        this.matHangDaNhap = matHangDaNhap;
    }
    
    
}
