/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import model.KhachHang;

/**
 *
 * @author Phan Quang
 */
public class KhachHangDAO extends DAO{

    public KhachHangDAO() {
        super();
    }
    
    public KhachHang[] timKh(String key){
        return new KhachHang[10];
    }
    
    public boolean xoaKH(KhachHang kh){
        return true;
    }
    
    public KhachHang[] getKhachHang(String hoTen, String DOB, String diaChi, String soCCCD){
        return new KhachHang[10];
    }
}
