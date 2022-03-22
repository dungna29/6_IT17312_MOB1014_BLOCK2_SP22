/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_4_Array_ArrayList_List;

/**
 *
 * @author dungna29
 */
public class B3_ThuatToanNoiBot_BubbleSort {

    public static void main(String[] args) {
        int arrNumbers[] = {99, 2, 1, 0};
        //In mảng khi chưa sắp xếp
        for (int x : arrNumbers) {
            System.out.print(x + " ");
        }
        System.out.println("");
        //Triển khai thuật toán
        /*
            1. Chạy code bẳng tay ra giấy, word, excel...
            99 2 1 0
            i = 0 | arr[0] > arr[1] | 99 > 2 = True
            2 99 1 0
            i = 0 | arr[0] > arr[2] | 2 > 1 = True
            1 99 2 0
            i = 0 | arr[0] > arr[3] | 1 > 0 = True
            0 99 2 1
            i = 1 | arr[1] > arr[2] | 99 > 2 = True
            0 2 99 1
            i = 1 | arr[1] > arr[3] | 2 > 1 = True
            0 1 99 2
            i = 2 | arr[2] > arr[3] | 99 > 2 = True
            0 1 2 99
         */
//        for (int i = 0; i < arrNumberss.length - 1; i++) {
//            for (int j = i + 1; j < arrNumberss.length; j++) {
//                if (arrNumberss[i] > arrNumberss[j]) {
//                    int temp = arrNumberss[i];
//                    arrNumberss[i] = arrNumberss[j];
//                    arrNumberss[j] = temp;
//                }
//            }
//        }

        for (int i = 0; i < arrNumbers.length - 1; i++) {
            System.out.println("Lần chay thứ: " + i);
            for (int x : arrNumbers) {
                System.out.print(x + " ");
            }
            System.out.println("");
            for (int j = i + 1; j < arrNumbers.length; j++) {
                System.out.printf("Điều kiện %d > %d \n", arrNumbers[i], arrNumbers[j]);
                if (arrNumbers[i] > arrNumbers[j]) {
                    int temp = arrNumbers[i];
                    arrNumbers[i] = arrNumbers[j];
                    arrNumbers[j] = temp;
                    System.out.printf("Hoán vị của: %d & %d \n", arrNumbers[i], arrNumbers[j]);
                    for (int x : arrNumbers) {
                        System.out.print(x + " ");
                    }
                    System.out.println("");
                }
            }
        }
        System.out.println("");
        for (int x : arrNumbers) {
            System.out.print(x + " ");
        }

    }
}
