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
public class Nguoi implements Comparable<Nguoi>{
    private String ten;
    private int namSinh;
    private int gioiTinh;
    private String sdt;

    public Nguoi() {
    }

    public Nguoi(String ten, int namSinh, int gioiTinh, String sdt) {
        this.ten = ten;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.sdt = sdt;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public int getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(int gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    @Override
    public String toString() {
        return "{" + "ten=" + ten + ", namSinh=" + namSinh + ", gioiTinh=" + gioiTinh + ", sdt=" + sdt + ' ';
    }

    @Override
    public int compareTo(Nguoi o) {
        //- Đối với chuỗi dùng cách này
        //return getTen().compareTo(o.getTen());//Sắp xếp xuôi
        //return -getTen().compareTo(o.getTen());//Sắp xếp ngược
        
        //Muốn sắp xếp dạng số
        
        if (getNamSinh() > o.getNamSinh()) {
            return -1;
        }else{
            return 1;
        }
    }

    
    
    
}
