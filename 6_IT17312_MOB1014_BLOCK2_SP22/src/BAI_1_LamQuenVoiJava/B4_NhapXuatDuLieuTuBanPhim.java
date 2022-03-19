/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_1_LamQuenVoiJava;

import java.util.Scanner;

/**
 *
 * @author dungna29
 */
public class B4_NhapXuatDuLieuTuBanPhim {
     /*
       Bài 4: Nhập xuất dữ liệu từ bàn phím
    1. Xuất dữ liệu ra màn hình: In giá trị mặc định hoặc giá của biến ra màn hình
        + Công thức: sout + tab
        + System.out.println(<giá trị hoặc tập giá trị>);
        + System.out.print(<giá trị hoặc tập giá trị>);
        + System.out.printf("Chào các %s bạn đến với năm học %d",value,value);
    2. Nhập dữ liệu ra màn hình:
        + Sử dụng 1 Class: Scanner sc = new Scanner(System.in);
        + Để đọc dữ liệu thì cần định nghĩa rõ muốn lưu dữ liệu nào khi người dùng nhập.
        + Để lấy giá trị từ bàn phím: sc.next<Kiểu dữ liệu muốn>();
   */
    public static void main(String[] args) {
        //1. Xuất dữ liệu ra màn hình
        System.out.print("Tôi muốn trở thành");
        System.out.println(" người học không chép code");
        System.out.println(" \t trong ngành \n PTPM");// \t = 1tab /n = xuống dòng
        
        //Đưa ra 1 template mẫu và truyền giá trị vào cho nó
        String name = "Huy";
        int ns = 2003;
        System.out.printf("Chào bạn %s sinh năm %d tại năm %d \n",name,ns,2022);
        
        //2. Nhập dữ liệu
        //Viết 1 chương trình nhập tên sau đó in ra màn hình
        
        //Bước 1: Xác định số lượng biến cần sử dụng
        String name1;
        
        //Bước 2: Khai báo thư viện Scanner
        Scanner sc = new Scanner(System.in);
        
        //Bước 3: Gán giá trị cho biến
        System.out.println("Mời bạn nhập tên: ");
        name1 = sc.nextLine();//Gá giá trị người dùng nhập cho biến và sc.nextLine() có kiểu dữ liệu String.
        
        //Bước 4: Thực thi
        System.out.printf("Chào bạn %s học lại",name1);
    }
}
