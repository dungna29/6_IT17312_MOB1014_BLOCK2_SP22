/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_6_Method;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dungna29
 */
public class S1_Method_Void {

    /*
         *  Bài Phương thức - Method
         *  Định nghĩa: 1 tập các câu lệnh cùng nhau thực hiện 1 tác vụ nào đó.
         *  LỢI ÍCH: - Giúp quản lý code tốt hơn
         *           - Tái sử dụng
         *
         *  Công thức chung:
         *  <Phạm vi truy cập> <Kiểu trả về> <Tên phương thức> (<Danh sách tham số>)
         *  {
         *          Body code
         *  }
    
         * <Phạm vi truy cập> - Access Modifier:Public,Private,Protected, Default
         *
         * <Kiểu trả về> : có 2 kiểu trả về và không trả về
         *          - Kiểu không trả về: void
         *          - Kiểu trả về: là giá trị(int,string,double....) hoặc tập giá trị(Array,List.....) hoặc đối tượng(class) và còn nhiều kiểu khác.
         *
         * <Tên phương thức>: Tên động từ viết thường + tên hàm viết hóa chữ cái đầu của từ
         * <Danh sách tham số>: Phương thức có thể có tham hoặc không tham số và lưu ý khi sử dụng tham số thì khi gọi phương thức thì phải truyền đúng vị trí của tham số.
     */
    public static void main(String[] args) {
        //Phần 1: Để sử dụng được phương thức thì phải biết tên phước thức và phương thức đó đang nằm trong Class nào.
        S1_Method_Void s1 = new S1_Method_Void();
        //s1.tinhTong; Sai vì thiếu (); khi kết thúc gọi phương thức
        s1.tinhTong();
        
        //Phần 2: Sử dụng phương thức có tham số
        /*
            1. Truyền đủ tham số
            2. Đúng kiểu đữ liệu
            3. Truyền giá trị phải theo đúng thứ tự
        */
        
        //Đối với nạp chồng phương thức để gọi được đúng phương thức bắt buộc phải truyền đủ số lượng tham số tương ứng.
        s1.tinhTong(6, 7);
        s1.tinhTong(6, 7,1);
        s1.tinhTong(6, 7,3,"a");

    }

    //1. Không trả về không tham số
    public void tinhTong() {//() Không tham số
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Mời nhập a: ");
        a = Integer.parseInt(sc.nextLine());
        System.out.println("Mời nhập b: ");
        b = Integer.parseInt(sc.nextLine());
        System.out.printf("%d + %d = %d", a, b, a + b);
    }

    //2. Không trả về có tham số
    public void tinhTong(int a, int b) {
        System.out.printf("%d + %d = %d", a, b, a + b);
    }
    public void tinhTong(int a, int b,int c) {
        System.out.printf("%d + %d + %d = %d", a, b,c, a + b+c);
    }
    public void tinhTong(int a, int b,int c,int d) {
        System.out.printf("%d + %d + %d = %d", a, b,c, a + b+c);
    }
    public void tinhTong(int a, int b,int c,String d) {
        System.out.println("Đây không phải phương thức tính tổng.");
       // System.out.printf("%d + %d + %d = %d", a, b,c, a + b+c);
    }
    //Các phước thức phía trên được gọi là nạp chồng phương thức overloading trong tính đa hình
    
    //Ngoài ra các tham số có thể là các kiểu dữ liệu khác nhau
    public void method1(int[] arr,ArrayList arrlst,List<String> lstNames){
        
    }
}
