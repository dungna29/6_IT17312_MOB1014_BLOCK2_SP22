/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_2_TOANTU_CAULENHRENHANH;

import java.util.Scanner;

/**
 *
 * @author dungna29
 */
public class B7_Switch_Case {

    /*
       Switch Case là 1 câu lệnh rẽ nhánh
        
       Công thức: sw + tab
    
        switch (<Biểu thức>) {
            case <Giá trị 1>:  
                Thực hiện 1 hành động nào đó
                break; - Sau khi thực hiện 1 hành động xong thì sẽ thoát khỏi Switch
            case <Giá trị 2>:                
                break;
            ..........
            case <Giá trị n>:                
                break;
            default:
                Khi chọn các case không thỏa mãn thì sẽ chạy vào đây                
        }
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        while (true) {
             String input;
            System.out.println("Menu quán FPOLY");
            System.out.println("1. Phở");
            System.out.println("2. Bún");
            System.out.println("3. Cơm rang");
            System.out.println("4. Bánh mì");
            System.out.println("5. Thoát chương trình");
            System.out.print("Mời bạn chọn món: ");
            input = sc.nextLine();
            switch (input) {
                case "1":
                    System.out.println("Bạn chọn món phở");
                    //break;
                case "2":
                     System.out.println("Bạn chọn món bún");
                    //break;
                case "3":
                     System.out.println("Bạn chọn món cơm");
                    break;
                case "4":
                     System.out.println("Bạn chọn món bánh");
                    break;
                case "5":
                    System.out.println("Hẹn gặp lại");
                    System.exit(0);//Thoát chương trình
                    break;
                default:
                    System.out.println("Hẹn gặp lại");

            }
        }
    }
}
