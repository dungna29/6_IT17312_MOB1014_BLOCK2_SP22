/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_7_KeThua;

/**
 *
 * @author dungna29
 */
public class Main {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien();
        sv1.setTen("Hoàng");
        sv1.setHo("Nguyễn");
        sv1.setMsv("PH");
        sv1.setNganhHoc("UDPM");
        //.....
        
        //Khi kế thừa thì contructor có tham số vẫn đầy đủ các thuộc tính được kế thừa từ lớp cha.
        
        //Ghi đè:
        SinhVien sv2 = new SinhVien();
        Nguoi n1 = new Nguoi();
        n1.method1(0);
        sv2.method1(0);
    }
}
