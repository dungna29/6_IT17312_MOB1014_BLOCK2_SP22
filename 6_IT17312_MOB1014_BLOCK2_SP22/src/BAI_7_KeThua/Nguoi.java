/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_7_KeThua;

/**
 *
 * @author dungna29
 */
//Coi lớp Người là lớp Cha
public class Nguoi {

    //Đưa các thuộc tính chung lên trên lớp cha
    private String ten;
    private String tenDem;
    private String ho;
    private String sdt;
    private String cmt;

    public Nguoi() {
    }

    public Nguoi(String ten, String tenDem, String ho, String sdt, String cmt) {
        this.ten = ten;
        this.tenDem = tenDem;
        this.ho = ho;
        this.sdt = sdt;
        this.cmt = cmt;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTenDem() {
        return tenDem;
    }

    public void setTenDem(String tenDem) {
        this.tenDem = tenDem;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getCmt() {
        return cmt;
    }

    public void setCmt(String cmt) {
        this.cmt = cmt;
    }

    public void method1(int a) {
 System.out.println("Phương thức lớp cha in ra");
    }

    public int method2(int a, int b, int c) {
        return 20222;
    }

    private void method3(int a) {

    }
}
