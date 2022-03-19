package BAI_1_LamQuenVoiJava;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author dungna29
 */
public class B5_CacHamToanHoc {

    public static void main(String[] args) {
        // *********** Toán tử toán học trong Java ***********
        //Thứ tự ưu tiên toán học (Nhân Chia > Cộng Trừ > Từ trái sang phải)
        System.out.println(5 + 9 * 2 - 9 / 3);//=? 20

        //Lưu ý trong lập trình: Toán tử (+) có thể sử dụng để cộng chuỗi 
        //String + String = StringString
        //Xuan + Son = XuanSon
        
        // *********** Các hàm toán học có sẵn trong java  ***********
        //Math.min(a, b) - Lấy số nhỏ nhất của 2 số a và b (Sử dụng nhiều)      
        //Math.max(a, b) - Lấy số lớn nhất của 2 số và b
        //Math.pow(a, n) - Bình phương 1 số
        //Math.sqrt(a)- Tính √𝑎 (căn bậc 2 của a)
        //Math.abs(a) - Lấy giá trị tuyệt đối của a
        //Math.ceil(a) -Lấy số nguyên trên của a
        //Math.floor(a) - Lấy số nguyên dưới của a
        //Math.round(a) - Làm tròn số của a
        //Math.random() - Sinh số ngẫu nhiên từ 0 đến 1 (0.0 and less than 1.0)
        System.out.println(Math.max(99, 100));//= 100
        
        
    }
}
