/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_MAU_OOP_NYMOI;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dungna29
 */
//Triển khai các chức năng quản lý đối tượng
public class NguoiYeuMoiService {
    //Các biến toàn cục trình bên lên đầu
    Scanner _sc = new Scanner(System.in);
    List<NguoiYeuMoi> _lstNYMoi;
    NguoiYeuMoi _NYMoi;
    String _input;

    public NguoiYeuMoiService() {
        _lstNYMoi = new ArrayList<>();
    }
    public void addNew(){
        System.out.print("Mời bạn chọn số lượng: ");
        _input = _sc.nextLine();
        for (int i = 0; i < Integer.parseInt(_input); i++) {
            _NYMoi = new NguoiYeuMoi();//Mỗi lần thêm mới thì phải khởi tạo mới đối tượng
            System.out.print("Mời nhập tên: ");
            _NYMoi.setTen(_sc.nextLine());
            System.out.print("Mời nhập ns: ");
            _NYMoi.setNamSinh(Integer.parseInt(_sc.nextLine()));
            //... Về nhà fill nốt
            //Khi thêm xong 1 đối tượng
            _lstNYMoi.add(_NYMoi);
        }
    }
    
}
