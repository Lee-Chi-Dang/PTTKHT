/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import model.KhachHang;
import model.PhongDatTruoc;
import model.PhongHat;

/**
 *
 * @author Phan Quang
 */
public class PhongDatTruocDAO extends DAO{

    public PhongDatTruocDAO() {
        super();
    }
    
    public boolean xoaPhongDAtTruoc(PhongDatTruoc pd){
        return true;
    }
    
    public PhongHat timPhongDatTruoc(KhachHang kh){
        return new PhongHat();
    }
}
