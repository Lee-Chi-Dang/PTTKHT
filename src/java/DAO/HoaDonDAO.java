/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import model.HoaDon;
import model.PhongDatTruoc;
import model.PhongHat;

/**
 *
 * @author Phan Quang
 */
public class HoaDonDAO extends DAO{

    public HoaDonDAO() {
        super();
    }
    
    public PhongDatTruoc getHoaDon(int idPhong){
        return new PhongDatTruoc();
    }
    
    public HoaDon[] getHoaDon(int thang, int nam){
        return new HoaDon[10];
    }
    
    public boolean daThanhToan(PhongHat ph){
        return true;
    }
}
