/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.util.Date;
import model.PhongHat;

/**
 *
 * @author Phan Quang
 */
public class PhongHatDAO extends DAO{

    public PhongHatDAO() {
        super();
    }
    
    public PhongHat[] timPhongTrong(Date ci){
        return new PhongHat[10];
    }
    
    public PhongHat[] getPhongHat(String ten, String loaiPhong, String gia, String viTri){
        return new PhongHat[10];
    }
}
