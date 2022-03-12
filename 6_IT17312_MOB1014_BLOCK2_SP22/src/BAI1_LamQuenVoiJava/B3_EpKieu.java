/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1_LamQuenVoiJava;

/**
 *
 * @author dungna29
 */
public class B3_EpKieu {

    /*
        1. Ép kiểu từ String về Số
        2. Ép kiểu giữa các các số với nhau
     */
    public static void main(String[] args) {
        //1. Ép kiểu từ String về số
        String number1 = "100", number2 = "1", kq;
        kq = number1 + number2;// = 1001 Vì đây là hành động cộng chuỗi
        System.out.println(kq);
        //Ép kiểu là đưa kiểu dữ liệu của giá trị về 1 kiểu khác
        int kq2 = Integer.parseInt(number1) + Integer.parseInt(number1);
        System.out.println(kq2);//=101
        
        //Ngoài ra còn rất nhiều cách ép kiểu dữ liệu khác nhau từ String về số
        //Integer.parseInt(<String>)
        //Double.parseDouble(<String>)
        //Float.parseFloat(<String>)
        //Byte.parseByte(<String>)
        //..........
        
        //2. Ép kiểu giữa các số với nhau
        int a = 9;
        double b = 9.9;
        b = a;//Ép kiểu tự động
        //a = b;
    }
}
