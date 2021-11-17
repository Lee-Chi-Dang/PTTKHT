/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import model.HoaDonTong;

/**
 *
 * @author Phan Quang
 */
public class HoaDonTongDAO extends DAO{

    public HoaDonTongDAO() {
        super();
    }
    
    public HoaDonTong[] getHoaDonTong(){
        return new HoaDonTong[10];
    }
}
