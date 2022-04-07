/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SORT_LIST_OBJ;

import BAI_MAU_OOP_NYMOI.*;

/**
 *
 * @author dungna29
 */
public class NguoiYeuMoi extends Nguoi{
    private double vong1;
    private double vong2;
    private double vong3;
    private String soThich;
   

    public NguoiYeuMoi() {
    }

    public NguoiYeuMoi(double vong1, double vong2, double vong3, String soThich, String ten, int namSinh, int gioiTinh, String sdt) {
        super(ten, namSinh, gioiTinh, sdt);
        this.vong1 = vong1;
        this.vong2 = vong2;
        this.vong3 = vong3;
        this.soThich = soThich;
    }

    

    public double getVong1() {
        return vong1;
    }

    public void setVong1(double vong1) {
        this.vong1 = vong1;
    }

    public double getVong2() {
        return vong2;
    }

    public void setVong2(double vong2) {
        this.vong2 = vong2;
    }

    public double getVong3() {
        return vong3;
    }

    public void setVong3(double vong3) {
        this.vong3 = vong3;
    }

    public String getSoThich() {
        return soThich;
    }

    public void setSoThich(String soThich) {
        this.soThich = soThich;
    }

    public String getTrangThai() {
        return vong3 < 50?"Bình thường":vong3 < 90?"Không bình thường":"Rất bình thường";
    }

//    public void setTrangThai(String trangThai) {
//        this.trangThai = trangThai;
//    }

    
    @Override
    public String toString() {
        return super.toString() + " vong1=" + vong1 + ", vong2=" + vong2 + ", vong3=" + vong3 + ", soThich=" + soThich + " " + getTrangThai() + '}';
    }

   
    
}
