/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CHUA_BAI_TAP_LAB123;

import java.util.Scanner;

/**
 *
 * @author dungna29
 */
public class LAB123 {

    static Scanner sc = new Scanner(System.in);//Biến toàn cục

    public static void main(String[] args) {
        do {
            String input;
            System.out.println("1. Bài 1");
            System.out.println("2. Bài 2");
            System.out.println("3. Bài 3");
            System.out.print("Mời bạn chọn: ");
            input = sc.nextLine();
            switch (input) {
                case "1":
                    Bai0();
                    break;
                case "2":
                    Bai1();
                    break;
                case "3":
                    bai3();
                    break;
                case "4":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Bạn vui lòng chọn lại");
            }
        } while (true);
    }

    static void Bai0() {
        int khoang1, khoang2;//Biến cục bộ
        System.out.println("Mời nhập khoảng 1: ");
        khoang1 = Integer.parseInt(sc.nextLine());//8
        System.out.println("Mời nhập khoảng 2: ");
        khoang2 = Integer.parseInt(sc.nextLine());//6
        //Cách 1: Sử dụng hoán vị
//        if (khoang1 > khoang2) {
//            int temp = khoang1;
//            khoang1 = khoang2;
//            khoang2 = temp;
//        }
        for (int i = Math.min(khoang1, khoang2); i < Math.max(khoang1, khoang2); i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
        }
    }

    static void Bai1() {
        int[] arrSo;//Khai báo mảng
        int size;
        System.out.print("Bạn muốn nhập bao nhiêu: ");
        size = Integer.parseInt(sc.nextLine());//Kích thước mảng do người dùng nhập
        arrSo = new int[size];//Sau khi biết được kích thước thì sẽ khởi tạo mảng
        for (int i = 0; i < arrSo.length; i++) {
            System.out.printf("Mời nhập arr[%d] : ", i);
            arrSo[i] = Integer.parseInt(sc.nextLine());//Nhập giá trị cho từng phần tử trong mảng.
        }
        for (int x : arrSo) {
            System.out.print(((x % 2 == 0) ? x : "") + " ");//% là chia lấy dư
        }
        System.out.println("");
        for (int x : arrSo) {
            System.out.print(((x % 2 != 0) ? x : "") + " ");
        }
    }

    static void bai3() {
        String[] arrNames, arrMsv;
        int[] arrNs;
        int size;
        System.out.print("Mời bạn nhập số lượng: ");
        size = Integer.parseInt(sc.nextLine());
        //Khởi tạo 3 mảng
        arrNames = new String[size];
        arrNs = new int[size];
        arrMsv = new String[size];
        for (int i = 0; i < arrMsv.length; i++) {
            System.out.println("Mời bạn nhập tên: ");
            arrNames[i] = sc.nextLine();
            System.out.println("Mời bạn nhập ns: ");
            arrNs[i] = Integer.parseInt(sc.nextLine());
            System.out.println("Mời bạn nhập msv: ");
            arrMsv[i] = sc.nextLine();
        }
        for (int i = 0; i < 10; i++) {
            System.out.printf(" %s     %d | %d     %s", arrNames[i], arrNs[i], 2022 - arrNs[i], arrMsv[i]);
        }
    }
}
