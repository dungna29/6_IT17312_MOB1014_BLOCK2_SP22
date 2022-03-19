/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_3_VONGLAP;

/**
 *
 * @author dungna29
 */
public class B1_BaVongLapCoBan {

    /*
         * BàiVòng lặp:
         *
         * Định nghĩa chung cho tất cả vòng lặp:
         * Vòng lặp cho phép lặp lại một hoặc nhiều câu lệnh cho đến khi thỏa mãn điều kiện được chỉ định định.
         *
         * Các loại vòng lặp: while, do..while, for, foreach
         *
         * Từ khóa sử dụng trong vòng lặp:
         *
         * break - ngắt vòng lặp
         * continue: Sẽ bỏ qua các đoạn code phía sau nó và nó quay trở lại lần lặp tiếp theo.
         *
         * Vòng lặp while: Chỉ chạy khi điều kiện luôn đúng và nếu điều kiện luôn đúng ko điểm dừng thì được gọi là vòng lặp vô hạn.
         * + Cách dùng: wh + tab
         *
         * + Công thức:
         *  while (true)
            {
                //Thực thi 1 câu lệnh hoặc nhiều câu lệnh
            }
  
            Vòng lặp Do..While: Thực hiện hành động ít nhất là 1 lần. Điều kiện đề vòng lặp chạy giống như While(True).
           Cách gõ: do + tab
           Công thức: 
           do {
                      //Thực hiện hành động ít nhất là 1 lần.
           } while (true);
  
            Cách gõ: for + tab
            Công thức:
             for (int i = 0; i < 10; i++) {
                }
            int i = 0: Điểm bắt đầu của vòng lặp có kiểu số nguyên
            i < 10: Điều kiện để ngắt vòng
            i++: Tăng bước nhẩy lên 1
     */
    public static void main(String[] args) {
        /*
            1. Điểm bắt đầu
            2. Điều kiện ngắt vòng lặp
            3. Bước nhẩy
         */

        //1. For: for + tab
        for (int i = 0; i < 5; i++) {
            System.out.println("Tôi muốn học tốt JAVA1");
        }

        //2. while: wh + tab
        int i = 0;
        while (i < 5) {
            System.out.println("Tôi muốn học tốt JAVA1");
            i++;
        }

        //3. do...while: do + tab
        int j = 0;
        do {
            System.out.println("Tôi muốn học tốt JAVA1");
            j++;
        } while (j < 5);
        
        //Ví dụ Continue:
        for (int k = 0; k < 10; k++) {
            if (k%2==0) {
                break;
            }
            System.out.print(k + " ");
        }
        
        /*
            Bảng nhân 9
            9 x 1 = 9
            9 x 2 = 18
            9 x 3 = 27
            9 x 4 = 36
            .....
            9 x 10 = 90
        */
        int a = 9, b = 1;
        do {
            System.out.printf("%d x %d = %d \n",a,b,a*b);
            b++;
        } while (b<=10);
    }
}
