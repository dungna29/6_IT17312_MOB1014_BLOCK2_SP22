/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_7_KeThua;

/**
 *
 * @author dungna29
 */
public class SinhVien1 {
    private String ten;
    private String tenDem;
    private String ho;
    private String sdt;
    private String cmt;
    private String msv;
    private String nganhHoc;
    
    //Triển khai đủ 4 phần ở dưới

    public SinhVien1() {
    }

    public SinhVien1(String ten, String tenDem, String ho, String sdt, String cmt, String msv, String nganhHoc) {
        this.ten = ten;
        this.tenDem = tenDem;
        this.ho = ho;
        this.sdt = sdt;
        this.cmt = cmt;
        this.msv = msv;
        this.nganhHoc = nganhHoc;
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

    public String getMsv() {
        return msv;
    }

    public void setMsv(String msv) {
        this.msv = msv;
    }

    public String getNganhHoc() {
        return nganhHoc;
    }

    public void setNganhHoc(String nganhHoc) {
        this.nganhHoc = nganhHoc;
    }
    
    public void inRaManHinh(){
        
    }
}
