/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import model.TaiKhoan;

/**
 *
 * @author Phan Quang
 */
public class TaiKhoanDAO extends DAO{

    public TaiKhoanDAO() {
        super();
    }
    
    public TaiKhoan[] getTaiKhoan(String tenTK, String matKhau, int loaiTK){
        return new TaiKhoan[10];
    }
}
