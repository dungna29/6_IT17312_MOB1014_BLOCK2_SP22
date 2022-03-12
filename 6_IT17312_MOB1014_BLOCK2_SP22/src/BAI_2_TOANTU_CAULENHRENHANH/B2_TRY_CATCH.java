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
public class B2_TRY_CATCH {

    public static void main(String[] args) {
        //Cách gõ: try + tab
        /*
     1. Không sử dụng try catch khi đang lập trình.
     2. Ở môi trường học tập chỉ dùng try catch khi các bạn nộp bài, mang bài lên chấm, đi bảo vệ....
     3. Trong môi trương làm việc: Chỉ khi nào đóng gói cho Tester hoặc đóng gói cho khách hàng thì bắt buộc phải dùng. 
         */
        /*
            try {
                Thực thi câu lệnh nếu xảy ra lỗi sẽ đẩy xuống catch
            } catch (Exception e) {
                Thực hiện 1 hành động nào đó khi câu lệnh trên xảy ra lỗi
            }
         */
        Scanner sc = new Scanner(System.in);
        try {
            int a;
            System.out.print("Mời bạn nhập số:  ");
            a = Integer.parseInt(sc.nextLine());
            System.out.println(a);
        } catch (NumberFormatException numberFormatException) {
            System.out.println("Lỗi rồi");
            numberFormatException.printStackTrace();
        }

        System.out.println("Đã chạy xong");
    }
}
