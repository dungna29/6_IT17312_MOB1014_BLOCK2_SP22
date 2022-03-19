/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_4_Array_ArrayList_List;

/**
 *
 * @author dungna29
 */
public class B1_Array {
    /*
         * Phần 1: Mảng 1 chiều
         *
         *  1. Định nghĩa: Mảng dùng để lưu trữ nhiều phần tử có cùng kiểu dữ liệu (Biến dùng để lưu trữ 1 giá trị có cùng kiểu dữ liệu).
         *          - Để truy xuất (để lấy giá trị) các phần tử thì cần phải biết chỉ số(index). Index là số nguyên và bắt đầu từ 0 1 2 3....
                    - Hai câu lệnh đi kèm vòng lặp: 
                      break; Ngắt vòng lặp
                      continue; Bỏ qua đoạn code phía sau và chạy sang vòng lặp tiếp theo
         *
         *  2. Khai báo 1 mảng trong JAVA:
         *          - Cách 1:
         *              <Kiểu dữ liệu>[] arr<Tên Mảng>; || <Kiểu dữ liệu> arr<Tên Mảng>[];
         *              arr<Tên Mảng> = new <Kiểu dữ liệu>[length];//Khởi tạo mảng có kích thước.
         *          - Cách 2: 
         *              <Kiểu dữ liệu>[] arr<Tên Mảng> = new <Kiểu dữ liệu>[length];
         *
         *          - Cách 3:
         *     <Kiểu dữ liệu>[] arr<Tên Mảng> = new <Kiểu dữ liệu>[] {value1,value2..,valuen};//Khởi tạo mảng kiểu tường minh.
         *
         *     
         *
         *  3. Truy xuất các phần tử trong mảng
         *      - Gán giá trị cho mảng:
         *           <tên mảng>[index] = Giá trị cần gán.
         *   
         *     - Lấy giá trị trong mảng:
         *          <tên mảng>[index] = Giá trị của mảng tại vị trí.
         *      Lưu ý: Để lấy nhiều giá trị trong mảng xuất ra cần sử dụng vòng lòng.
         *
         *  4. Kích thước hoặc độ dài của mảng sử dụng thuộc tính length.
         *      <tên mảng>.length = kích thước mảng có kiểu số nguyên
   */
    public static void main(String[] args) {
        //Phần 1: Khai báo báo biến
        int a = 5;
        
        //Phần 2: Khai báo mảng
        int[] arrNumber1;//Khai báo mảng
        arrNumber1 = new int[5];//Khởi tạo mảng thì mới sử dụng được và đi kèm kích thước mảng.
        
        String arrNames1[] = new String[10];
        
        String[] arrNames2 = {"JAVA1","JAVA2","JAVA3"};
        String[] arrNames3 = new String[] {"JAVA1","JAVA2","JAVA3"};//Khai báo tường minh
        
        var arrName4 = new int[] {1,2,3,4,5,6};
        var arrName5 = new String[5];
        
        //Phần 3: Gán giá trị trong mảng cần biết index
        arrNumber1[0] = 99;//Gán giá trị vào vị trí số 0
        arrNumber1[1] = 12;
        arrNumber1[2] = 14;
        arrNumber1[3] = 16;
        arrNumber1[0] = 16;//Ghi đè giá trị vào vị trí
        
        //Phần 4: Lấy phần tử trong mảng
        System.out.println(arrNumber1[1]);
        
        //In nhiều phần tử trong mảng
        for (int x : arrNumber1) {
            System.out.print(x + " ");
        }
        System.out.println("");
        for (int i = 0; i < arrNumber1.length; i++) {
            System.out.print(arrNumber1[i] + " ");
        }
        /*     
                Bài 0: In bảng cửu chương theo khoảng mà người dùng nhập vào.
                 * Bài 1: Viết 1 chương trình cho phép người dùng nhập vào bao nhiêu số tùy thích. Sau khi nhập xong in ra màn hình các số chẵn trên 1 dòng và số lẻ trên 1 dòng.
                 *
                 * Bài 2: Viết 1 chương trình cho phép người dùng nhập vào 1 dãy điểm. In ra màn hình dãy điểm người vừa nhập và bệnh cạnh mỗi 1 đầu điều thông báo Trượt hoặt đỗ dựa trên điều kiện điểm đỗ >=5 và Trượt <5.
                 *
                 * Bài 3: Viết 1 chương trình nhập nhiều  thông tin của sinh viên POLY. Mỗi sinh viên khi nhập vào cần các thông tin sau: Tên, Năm Sinh, Msv. Sau khi người dùng nhập xong hết thông tin sinh viên cần thêm thì sẽ in tất cả ra màn hình lưu in thêm tuổi của mỗi sinh viên tương ứng.(Gợi ý mỗi thuộc tính là một mảng)
                 */
        
    }
}
