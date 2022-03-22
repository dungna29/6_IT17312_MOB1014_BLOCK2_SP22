/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_4_Array_ArrayList_List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author dungna29
 */
public class B5_List {
    /*
    Bài List
        - Định nghĩa: List Interface trong Java kế thừa Collection và nó cung cấp các phương thức 
                      để thao tác với các phần tử trong danh sách.
    
        + Phương thứ List    
                    - void add(int index, Object obj) || add(object value) Chèn obj vào trong List đang gọi tại index đã cho. 
                        Bất kỳ phần tử nào đã tồn tại trước tại hoặc trên điểm chèn bị bỏ qua. Vì thế, 
                        không có phần tử nào bị ghi đè.
                    - boolean addAll(int index, Collection c)	Chèn tất cả phần tử của c vào trong List
                        đang gọi tại chỉ mục đã cho. Bất kỳ phần tử nào đã tồn tại trước tại hoặc trên điểm
                        chèn bị bỏ qua. Vì thế, không có phần tử nào bị ghi đè. Trả về true nếu List đang gọi
                        thay đổi và nếu không trả về false.
                    - object get(int index)	Trả về đối tượng được lưu giữ tại index đã 
                        cho bên trong Collection đang gọi.
                    - int indexOf(Object obj)	Trả về index của sự xuất hiện đầu tiên của obj trong List đang gọi.
                        Nếu obj không là một phần tử trong list, -1 được trả về.
                    - int lastIndexOf(Object obj) Trả về index của sự xuất hiện đầu tiên của obj trong List 
                        đang gọi. Nếu obj không là một phần tử trong list, -1 được trả về
                    - ListIterator listIterator()	Sử dụng để trả về một Iterator mà bắt đầu từ phần 
                        tử đầu tiên của list.
                    - ListIterator listIterator(int index)	Sử dụng để trả về một Iterator mà phần tử bắt 
                        đầu từ chỉ số index chỉ định.
                    - object remove(int index)	Gỡ bỏ phần tử tại index từ List đang gọi và trả về phần tử 
                        bị xóa đó. List kết quả được compact lại. Đó là, các chỉ mục của dãy phần tử phụ bị 
                        lượng giảm đi 1.
                    - object set(int index, Object obj)	Gán obj tới vị trí được xác định bởi index bên trong 
                        List đang gọi.
                    - List subList(int start, int end)	Trả về một list mà bao gồm các phần tử từ start tới 
                        end-1 trong List đang gọi. Các phần tử trong list trả về cũng được tham chiếu bởi đối
                        tượng đang gọi.                        
    */
    public static void main(String[] args) {
        //Phần 1: List và có 2 loại Định kiểu và không định kiểu
        //Cách gõ ArrayL
        
        //1.1 List không định kiểu
        List lstKhongDinhKieu = new ArrayList();
        List lstKhongĐinhieu1;//Khai báo
        lstKhongĐinhieu1 = new ArrayList();//Khởi tạo
        
        //1.2 List có định kiểu
        //List<int> lstListInt = new ArrayList<>();//Sai phải sử dụng lớp đối tượng kiểu dữ liệu.
        List<Integer> lstInt = new ArrayList<>();
        List<Double> lstDouble = new ArrayList<Double>();//Khai báo tường minh
        List<String> lstString = new ArrayList<>();
        
        //Phần 2: Sử dụng phương thức.
        //2.1 Phương thức thêm đối tượng vào danh sách
        lstKhongDinhKieu.add(1);
        lstKhongDinhKieu.add(true);
        lstKhongDinhKieu.add(8.9);
        lstKhongDinhKieu.add("abc");
        lstKhongDinhKieu.add(1.2f);
        lstKhongDinhKieu.add('a');
        
        lstInt.add(1);
        //lstInt.add("1"); Sai kiểu dữ liệu
        lstInt.add(11);
        lstInt.add(12);
        lstInt.add(13);
        lstInt.add(0, 99);//Chèn số 99 vào vị trị 0 và dịch chuyển giá trị từ index 0 sang 1
        //2.2 Lấy giá trị sử dụng phương thức get
        System.out.println(lstInt.get(0));// = 99
        
        //lstInt.size() = Kích thước tập giá trị
        for (int i = 0; i < lstInt.size(); i++) {
            System.out.print(lstInt.get(i) + " ");
        }
        System.out.println("");
        
        System.out.println("Ngoài ra 1 vài phương thức");
        lstInt.remove(1);//Xoá phần tử vị trí 1 theo index
        System.out.println(lstInt.get(1));
        //lstInt.clear();//Xoá toàn bộ các phần tử trong danh sách
        //lstInt = new ArrayList<>();//Khởi tạo cũng làm mất hết các phần tử trong danh sách.
        
        //Sắp xếp mì ăn liền
        Collections.sort(lstInt); //Sắp xếp tăng dần
        Collections.reverse(lstInt);//Đảo ngược thứ tự trong danh sách
        
        if (lstInt.isEmpty()) {
            System.out.println("Danh sách rỗng bạn êi");
        }
    }
}
