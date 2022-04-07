/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_9_Abstract_Interface;

/**
 *
 * @author dungna29
 */
/*
   1. Khi lớp con kế thừa 1 lớp abstract thì bắt buộc phải ghi đè các phương thức abstract
*/
public class SinhVien extends Nguoi{
    private String att3;

    public SinhVien() {
    }

    public SinhVien(String att3, String att1, String att2) {
        super(att1, att2);
        this.att3 = att3;
    }

    public String getAtt3() {
        return att3;
    }

    public void setAtt3(String att3) {
        this.att3 = att3;
    }

    @Override
    public void method2(int a) {
        super.method2(a); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public int method1(int a, int b) {
        return super.method1(a, b); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    /*
       Khi ghi đè phương thức abstract thì triển khai code như bình thường.
    */
   

    @Override
    public void method4(int a, int b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public int method3(int a, int b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
