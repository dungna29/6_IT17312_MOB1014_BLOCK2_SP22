/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_1_LamQuenVoiJava;

/**
 *
 * @author dungna29
 */
public class B2_KhaiBaoBien {
     /*
      *********** Biến khái niệm cơ bản ***********
      Định nghĩa: Dùng để lưu trữ giá trị trong lập trình. Biến được lưu trữ ở trong Ram.
      Công thức:
    <kiểu dữ liệu> <tên biến> [=giá trị khởi đầu];
      <kiểu dữ liệu>: Giúp định nghĩa giá trị muốn lưu trữ có kiểu dữ liệu là gì
      <tên biến>:Giúp định danh và gọi biến đó khi sử dụng. Có phân biệt chữ hoa chữ thường.
      [=giá trị khởi đầu]: Đưa giá trị đúng kiểu dữ liệu
  
      *********** Quy tắc đặt tên ***********
      Tên biến có phân biệt chữ hoa và chữ thường. Nên đặt tên biến bằng Tiếng Anh
         String firstname;// Kiểu Normal  //Sử dụng khi tên biến có 2 từ trở lên
         String FirstName; //Kiểu CamelCase //Sử dụng khi tên Class có 2 từ trở lên hoặc 1 từ
         String first_name; // Kiểu Underscores //Sử dụng khi tên biến có 2 từ trở lên 
         Lưu ý: đặt tên biến không được phép bắt đầu bởi số , có dấu gạch ngang, sử dụng từ khóa của java (int,if,long....)
         int int = 5; //Vi phạm nguyên tắc đặt biến
         Trong cùng 1 class thì biến phải sử dụng tên khác nhau và đặt sao cho đúng nghĩa đại diện
      *********** Các kiểu dữ liệu có trong java ***********  
            + Kiểu số nguyên:byte, short, long, int
            + Kiểu số thực:float, double
            + Kiểu chuỗi và ký tự: String, char
            + Kiểu Logic: boolean (true, false)
            + Kiểu var: tự định nghĩa theo giá trị
    
      *********** Biến toàn cục và biến cục bộ ***********        
      + Biến toàn cục: Khai báo bên ngoài của phương thức
        - Bắt buộc phải khai báo có dấu gạch dưới _ trước tên biến:
        Ví dụ đặt tên: _firtName, _firstName;
      + Biến cục bộ: Khai báo bên trong phương thức. Biến cục bộ sẽ chỉ được sử dụng ở bên trong của 1 phương thức.  
   */
    String _name = "FPOLY";//Biến toàn cục
    public static void main(String[] args) {
        int a = 1;//Các biến bên trong phương thức là biến cục bộ
        
        //String - Chuỗi
        String name1;//Khai báo 1 biến có kiểu dữ liệu là String và không khởi tạo giá trị ban đầu.
        String name2 = "Nguyễn Văn A";//Khai báo 1 biến có kiểu dữ liệu là String và có khởi tạo giá trị ban đầu.
        String name3, name4, name5 = "ABC";
        
        //boolean  - Logic
        boolean b1 = true;//Hoặc false
        
        //float, double - số thực
        float f1 = 3.5f;
        double d1 = 3.5;
        
        //var - Kiểu dữ liệu ngầm định(Bắt buộc phải khởi tạo giá trị ban đầu, không khai báo nó bên ngoài phương thức, không dùng nó làm tham số)
        var v1 = true;
        var v2 = "A";
        var v3 = 1;
        var V4 = 0.6;
        var v5 = '%';
    }
}
