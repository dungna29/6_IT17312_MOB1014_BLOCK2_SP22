/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_8_XuLyChuoi;

/**
 *
 * @author dungna29
 */
public class S4_SoSanh {
    public static void main(String[] args) {
        String[] arrName = {"abc","Abe","aba","Ade"};
        //
        for (String x : arrName) {
            //equalsIgnoreCase So sánh tuyệt đối nhưng không phân biệt hoa thường.
            if (x.equalsIgnoreCase("ABC")) {
                System.out.print(x + " ");
            }
        }
        System.out.println("");
        for (String x : arrName) {
            if (x.toLowerCase().startsWith("a".toLowerCase())) {
                System.out.print(x + " ");
            }
        }
        System.out.println("");
        for (String x : arrName) {
            if (x.toLowerCase().contains("e".toLowerCase())) {
                System.out.print(x + " ");
            }
        }
        System.out.println("");
    }
}
