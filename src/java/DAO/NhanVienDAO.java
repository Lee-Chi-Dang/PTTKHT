/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import model.NhanVien;

/**
 *
 * @author Phan Quang
 */
public class NhanVienDAO {
    public NhanVienDAO(){}
    
    public NhanVien[] getNhanVien(String hoTen, String DOB, int gioiTinh, String lienHe, String diaChi){
        return new NhanVien[10];
    }
    
    public NhanVien[] getNhanVien(String hoTen, String diaChi, String mucLuong){
        return new NhanVien[10];
    }
}
