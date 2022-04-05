/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_8_XuLyChuoi;

import java.util.Scanner;

/**
 *
 * @author dungna29
 */
public class S2_MotVaiViDu {
    //Bài 1: Viết 1 chương trình nhập vào Full Name sao đó viết hoa chữ cái đầu của từ lên.  nguyen thi hoa = Nguyen Thi Hoa
    //Bài 2: Viết 1 chương trình zen mã tự động như sinh viên tại FPOLY.  nguyễn thị hoa = HoaNTPHXXX
    //Giải quyết 2 bài trên dựa vào lý thuyết xử lý chuỗi thầy đã up.
    //12h45 Chữa bài.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        do {
            String input,fullNames ="";
            System.out.print("Mời bạn nhập FULL NAME: ");
            input = sc.nextLine();//nguyen hoang anh
            //Cắt chuỗi thành mảng
            String[] arrNames = input.split("\\s+");//Cắt chuỗi theo khoảng trắng
            for (String x : arrNames) {
                fullNames += vietHoaChuCaiDau(x) + " ";//Cộng lại chuỗi các thành phần có trong tên sau khi đã viết hoa
            }
            System.out.printf("Tên viết hoa chữ cái đâu: %s",fullNames);
            System.out.println("");
            System.out.printf("Msv: %s \n",zenMaSVFPOLY(fullNames, "00125"));
           
        } while (true);
    }
    
    //Phương thức giúp viết hoa chữ cái đầu của từ
    public static String vietHoaChuCaiDau(String text){//nguYEn
        String temp = text.trim().toLowerCase();//nguyen
        return String.valueOf(temp.charAt(0)).toUpperCase()+ temp.substring(1);
    }
    //Phương thức zen mã sinh viên
    public static String zenMaSVFPOLY(String fullName, String number){//nguyen anh dung
        String temp = fullName.trim().toLowerCase();
        String[] arrNames = temp.split("\\s+");//Tách chuỗi thành mảng
        String msv = vietHoaChuCaiDau(arrNames[arrNames.length -1]);//Dung
        for (int i = 0; i < arrNames.length-1; i++) {
            msv +=String.valueOf(arrNames[i].charAt(0)).toUpperCase();
        }
        return msv +"PH"+number;//DungNAPH00125
        
    }
}
