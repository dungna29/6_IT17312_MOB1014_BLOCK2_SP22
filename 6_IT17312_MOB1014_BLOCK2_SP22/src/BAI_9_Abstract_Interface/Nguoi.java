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
    1. Lớp abstract cũng như bao class cha khác.
    2. Đã là lớp abstract thì phải có phương thức abstract
*/
public abstract class Nguoi {
    private String att1;
    private String att2;

    public Nguoi() {
    }

    public Nguoi(String att1, String att2) {
        this.att1 = att1;
        this.att2 = att2;
    }

    public String getAtt1() {
        return att1;
    }

    public void setAtt1(String att1) {
        this.att1 = att1;
    }

    public String getAtt2() {
        return att2;
    }

    public void setAtt2(String att2) {
        this.att2 = att2;
    }
    
    public int method1(int a, int b){
        return 0;
    }
    public void method2(int a){
        
    }
    //Phương thức abstract
    /*
        1. Không có body code
        2. Phương thức phải bao gồm từ khoá abstract
    */
    public abstract int method3(int a, int b);
    public abstract void method4(int a, int b);
}
