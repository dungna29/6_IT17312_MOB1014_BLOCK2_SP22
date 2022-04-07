/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SORT_LIST_OBJ;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author dungna29
 */
public class NguoiYeuMoiService {

    List<NguoiYeuMoi> _lstNYMoi;

    public static void main(String[] args) {
        NguoiYeuMoiService nym = new NguoiYeuMoiService();
        nym.xuatDs();
        System.out.println("========");
        nym.sort();
        nym.xuatDs();

    }

    public void sort() {
        //Cách 1: Bắt buộc lớp cần sắp xếp cần phải implements Comparable<obj>
        //Collections.sort(_lstNYMoi);

        //Cách 2:Comparator
        Collections.sort(_lstNYMoi, new Comparator<NguoiYeuMoi>() {
            @Override
            public int compare(NguoiYeuMoi o1, NguoiYeuMoi o2) {
//                  return o1.getTen().compareTo(o2.getTen());//Sắp xếp xuôi
                //return -o1.getTen().compareTo(o2.getTen());//Sắp xếp ngược
                if (o1.getNamSinh() > o2.getNamSinh()) {
                    return 1;
                } else {
                    return -1;
                }
            }

        });

        //Cách nên sử dụng khi đi thi và về nha search thêm: sort list object java lambda
        //_lstNYMoi.sort(Comparator.comparing(NguoiYeuMoi::getTen).reversed());
    }

    public NguoiYeuMoiService() {
        _lstNYMoi = new ArrayList<>();
        fake5Data();
    }

    public void xuatDs() {
        for (NguoiYeuMoi x : _lstNYMoi) {
            System.out.println(x.toString());
        }
    }

    public void fake5Data() {
        _lstNYMoi.add(new NguoiYeuMoi(50, 60, 59, "Chơi game", "A", 2000, 0, "09123"));
        _lstNYMoi.add(new NguoiYeuMoi(60, 60, 69, "Nghe nhạc", "B", 2001, 0, "09223"));
        _lstNYMoi.add(new NguoiYeuMoi(70, 60, 79, "Xem phim", "C", 2000, 0, "09323"));
        _lstNYMoi.add(new NguoiYeuMoi(80, 60, 79, "Hát", "D", 2000, 0, "09423"));
        _lstNYMoi.add(new NguoiYeuMoi(80, 60, 89, "Chơi game", "E", 2003, 0, "09523"));
        _lstNYMoi.add(new NguoiYeuMoi(90, 60, 79, "Chơi game", "A", 2000, 0, "09823"));
    }
}
