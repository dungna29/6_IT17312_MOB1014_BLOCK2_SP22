/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_6_Method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author dungna29
 */
public class S2_Method_TraVe {

    /*
  Phương thức trả về
           *  Công thức chung:
         *  <Phạm vi truy cập> <Kiểu trả về> <Tên phương thức> (<Danh sách tham số>)
         *  {
         *          Body code
                  return <Giá trị có kiểu của phương thức>;
         *  }
    
    Đối với đặt tên, tham số  thì sử dụng như void.
     */
    public static void main(String[] args) {
        //Cách gọi như void
        //Để sử dụng phải coi phương thức trả về như 1 giá trị, tập giá tri hoặc kiểu dữ liệu trả về.
        int a = 5;
        System.out.println(a+10);
        S2_Method_TraVe s2 = new S2_Method_TraVe();
        a = s2.tinhTong(5, 5);
        
        int[] arrTemp = s2.getYears1800_2022();
        for (int i = 0; i < s2.getYears1800_2022().length; i++) {
            System.out.println(s2.getYears1800_2022()[i]);
        }
        //Viết 1 phương trả về gồm 1 tập tên có kiểu dữ liệu String
    }
    public String[] getNames(){
        return new String[]{"Dũng","Toàn","Hoàng"};
    }
     public List getNames2(){
        return Arrays.asList("a","b","c");
        //return List.of("a", "b","C");
    }
    //Ví dụ1:
    public int tinhTong(int a, int b) {
        return a + b;
    }

    //Ví dụ 2: Trả ra 1 tập giá trị năm từ năm 1800 đến 2022
    public int[] getYears1800_2022() {
        int[] arr = new int[2023 - 1800];
        int temp = 1800;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp;
            temp++;
        }

        return arr;
    }

}
