/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_7_KeThua;

/*
- Lớp con
- Sử dụng từ khóa extends để kế thừa.
- Java || C# chỉ đơn kế thừa.
 */ 
public class SinhVien extends Nguoi{
    //Lớp con sẽ liệt kê các thuộc tính đặc trưng riêng để miêu tả cho đối tượng.
    private String msv;
    private String nganhHoc;

    public SinhVien() {
        
    }

    public SinhVien(String msv, String nganhHoc, String ten, String tenDem, String ho, String sdt, String cmt) {
        super(ten, tenDem, ho, sdt, cmt);
        this.msv = msv;
        this.nganhHoc = nganhHoc;
        //this: Dùng để tham chiếu đến thuộc tính, phương thức của lớp hiện tại.
        //super:Dùng để tham chiếu đến thuộc tính, phương thức của lớp cha.
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
    //Kế thừa phương thức của lớp cha chính là hành động ghi đè phương thức trong tính chất ĐA HÌNH OOP
    //ALt + INSERT => Override Method
    //Ghi đè phương thức thì bên lớp còn có thể code lại nội dung bên trong phương thức ghi đè.

    @Override
    public int method2(int a, int b, int c) {
        return super.method2(a, b, c); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void method1(int a) {
        System.out.println("Phương thức lớp con in ra");
    }
    
    
}
