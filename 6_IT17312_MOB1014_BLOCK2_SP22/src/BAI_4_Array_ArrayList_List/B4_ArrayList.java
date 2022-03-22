/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_4_Array_ArrayList_List;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author dungna29
 */
public class B4_ArrayList {
    /*
    Bài ArrayList
        - Định nghĩa: Lớp ArrayList trong java được sử dụng như một mảng động để lưu trữ các phần tử. 
                      ArrayList được tạo với một kích cỡ ban đầu. Khi kích cỡ này bị vượt, collection 
                      tự động được tăng. Khi các đối tượng bị gỡ bỏ, ArrayList có thể bị giảm kích cỡ.
        + Lưu ý:
                -   Có thể chứa các phần tử trùng lặp.
                -   Duy trì thứ tự của phần tử được thêm vào.
                -   Không đồng bộ (non-synchronized).
                -   Cho phép truy cập ngẫu nhiên, tốc độ truy xuất (get) phần tử nhanh vì nó lưu dữ liệu theo chỉ mục.
                -   Thao tác thêm/ xóa (add/ remove) phần tử chậm vì cần nhiều sự dịch chuyển nếu bất kỳ phần tử nào thêm/ xoá khỏi danh sách.
    
        + Phương thứ ArrayList    
                - boolean add(Object o)	Thêm phần tử được chỉ định vào cuối một danh sách.
                - void add(int index, Object element) || add(Object value) Chèn một phần tử được chỉ định 
                  tại vị trí (index) được chỉ định vào danh sách. 
                  Ném IndexOutOfBoundsException nếu index này ở bên ngoài dãy (index < 0 hoặc index > size()).
                - boolean addAll(Collection c)	Thêm tất cả các phần tử trong collection được chỉ định vào 
                  cuối của danh sách gọi phương thức, theo thứ tự chúng được trả về bởi bộ lặp iterator.
                - boolean addAll(int index, Collection c)	Thêm tất cả các phần tử trong collection được 
                  chỉ định vào danh sách gọi phương thức, bắt đầu từ vị trí đã chỉ định. 
                  Ném NullPointerException nếu collection đã cho là null.
                - Object get(int index)	Trả về phần tử tại index đã cho. 
                  Ném IndexOutOfBoundsException nếu index đã cho là ở bên ngoài dãy 
                  (index < 0 hoặc index >= size()).
                - int indexOf(Object o)	Lấy vị trí (index) trong danh sách với sự xuất hiện đầu tiên
                của phần tử được chỉ định, hoặc -1 nếu danh sách không chứa phần tử này.
                - int lastIndexOf(Object o) Lấy vị trí (index) trong danh sách với sự xuất hiện cuối
                cùng của phần tử được chỉ định, hoặc -1 nếu danh sách không chứa phần tử này.
                - Object remove(int index) Gỡ bỏ phần tử tại index đã cho. 
                Ném IndexOutOfBoundsException nếu index ở ngoài dãy (index < 0 hoặc index >= size()).
                - void retainAll(Collection c)	Xóa những phần tử không thuộc collection c và 
                không thuộc list hiện tại khỏi list hiện tại. 
                Ném NullPointerException nếu collection đã cho là null.
                - void removeAll(Collection c)	Xóa những phần tử thuộc collection c và thuộc list hiện 
                tại khỏi list hiện tại. Ném NullPointerException nếu collection đã cho là null.
                - Object set(int index, Object element)	Thay thế phần tử tại vị trí đã cho trong list này với phần tử đã xác định. Ném IndexOutOfBoundsException nếu index ở ngoài dãy (index < 0 hoặc index >= size()).
                - Object[] toArray()	Chuyển một danh sách sang mảng và trả về một mảng chứa tất cả các phần tử trong danh sách này theo đúng thứ tự. Ném NullPointerException nếu mảng này là null.
                - Object[] toArray(Object[] a)	Chuyển một danh sách sang mảng và trả về một mảng chứa tất cả các phần tử trong danh sách này theo đúng thứ tự. Kiểu runtime là của mảng trả về giống như mảng đã xác định.
                - Object clone()	Tạo một bản sao của ArrayList.
                - void clear()	Xóa tất cả các phần tử từ danh sách.
                - void trimToSize()	Cắt dung lượng của thể hiện ArrayList này là kích thước danh sách hiện tại.
   */
    public static void main(String[] args) {
        //Phần 1: ArrayList và có 2 loại Định kiểu và không định kiểu
        //Cách gõ ArrayL
        
        //1.1 ArrayList không định kiểu
        ArrayList arrKhongDinhKieu = new ArrayList();
        ArrayList arrKhongDinhKieu1;//Khai báo
        arrKhongDinhKieu1 = new ArrayList();//Khởi tạo
        
        //1.2 ArrayList có định kiểu
        //ArrayList<int> arrListInt = new ArrayList<>();//Sai phải sử dụng lớp đối tượng kiểu dữ liệu.
        ArrayList<Integer> arrListInt = new ArrayList<>();
        ArrayList<Double> arrListDouble = new ArrayList<Double>();//Khai báo tường minh
        ArrayList<String> arrListString = new ArrayList<>();
        
        //Phần 2: Sử dụng phương thức.
        //2.1 Phương thức thêm đối tượng vào danh sách
        arrKhongDinhKieu.add(1);
        arrKhongDinhKieu.add(true);
        arrKhongDinhKieu.add(8.9);
        arrKhongDinhKieu.add("abc");
        arrKhongDinhKieu.add(1.2f);
        arrKhongDinhKieu.add('a');
        
        arrListInt.add(1);
        //arrListInt.add("1"); Sai kiểu dữ liệu
        arrListInt.add(11);
        arrListInt.add(12);
        arrListInt.add(13);
        arrListInt.add(0, 99);//Chèn số 99 vào vị trị 0 và dịch chuyển giá trị từ index 0 sang 1
        //2.2 Lấy giá trị sử dụng phương thức get
        System.out.println(arrListInt.get(0));// = 99
        
        //arrListInt.size() = Kích thước tập giá trị
        for (int i = 0; i < arrListInt.size(); i++) {
            System.out.print(arrListInt.get(i) + " ");
        }
        System.out.println("");
        
        System.out.println("Ngoài ra 1 vài phương thức");
        arrListInt.remove(1);//Xoá phần tử vị trí 1 theo index
        System.out.println(arrListInt.get(1));
        //arrListInt.clear();//Xoá toàn bộ các phần tử trong danh sách
        //arrListInt = new ArrayList<>();//Khởi tạo cũng làm mất hết các phần tử trong danh sách.
        
        //Sắp xếp mì ăn liền
        Collections.sort(arrListInt); //Sắp xếp tăng dần
        Collections.reverse(arrListInt);//Đảo ngược thứ tự trong danh sách
        
        if (arrListInt.isEmpty()) {
            System.out.println("Danh sách rỗng bạn êi");
        }
    }
}
