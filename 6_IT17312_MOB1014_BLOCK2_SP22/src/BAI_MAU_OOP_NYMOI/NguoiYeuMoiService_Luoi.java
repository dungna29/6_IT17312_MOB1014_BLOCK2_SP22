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
public class NguoiYeuMoiService_Luoi {

    //Các biến toàn cục trình bên lên đầu
    Scanner _sc = new Scanner(System.in);
    List<NguoiYeuMoi> _lstNYMoi;
    NguoiYeuMoi _NYMoi;
    String _input;

    public NguoiYeuMoiService_Luoi() {
        _lstNYMoi = new ArrayList<>();
        fake5Data();//Khi lớp service được khởi tạo thì danh sách sẽ có 6 phần tử
    }

    public void fake5Data() {
        _lstNYMoi.add(new NguoiYeuMoi(50, 60, 59, "Chơi game", "A", 2000, 0, "09123"));
        _lstNYMoi.add(new NguoiYeuMoi(60, 60, 69, "Nghe nhạc", "B", 2001, 0, "09223"));
        _lstNYMoi.add(new NguoiYeuMoi(70, 60, 79, "Xem phim", "C", 2000, 0, "09323"));
        _lstNYMoi.add(new NguoiYeuMoi(80, 60, 79, "Hát", "D", 2000, 0, "09423"));
        _lstNYMoi.add(new NguoiYeuMoi(80, 60, 89, "Chơi game", "E", 2003, 0, "09523"));
        _lstNYMoi.add(new NguoiYeuMoi(90, 60, 79, "Chơi game", "A", 2000, 0, "09823"));
    }

    public void addNew() {
        System.out.print("Mời bạn chọn số lượng: ");
        _input = _sc.nextLine();
        for (int i = 0; i < Integer.parseInt(_input); i++) {
            _lstNYMoi.add(new NguoiYeuMoi(Double.parseDouble(getInputValue("v1")), Double.parseDouble(getInputValue("v2")), Double.parseDouble(getInputValue("v3")), getInputValue("sở thích"), getInputValue("tên"), Integer.parseInt(getInputValue("năm sinh")), Integer.parseInt(getInputValue("giới tính")), getInputValue("sdt")));
        }
    }

    public void xuatDs() {
        for (NguoiYeuMoi x : _lstNYMoi) {
            System.out.println(x.toString());
        }
    }

    //Khi đã biết làm chức năng tìm kiếm 1 đối tượng thì chức năng XOÁ, SỬA là như nhau chỉ khác hành động bên trong.
    public void timKiem() {
        int temp = getIndex();
        if (temp == -5) {
            System.out.println("Không tìm thấy");
            return;
        }
        System.out.println(_lstNYMoi.get(temp).toString());
    }

    public void xoaNy() {
        int temp = getIndex();
        if (temp == -5) {
            System.out.println("Không tìm thấy");
            return;
        }
        _lstNYMoi.remove(temp);
        System.out.println("Xoá thành công");
    }

    public void suaNy() {
        int temp = getIndex();
        if (temp == -5) {
            System.out.println("Không tìm thấy");
            return;
        }
        System.out.println("1. Sửa tên. ");
        System.out.println("2. Sửa năm sinh ");
        System.out.print("Mời bạn chọn chức năng: ");
        _input = _sc.nextLine();
        switch (_input) {
            case "1":
                _lstNYMoi.get(temp).setTen(getInputValue("tên"));
                break;
            case "2":
                
                break;
            default:
                System.out.println("Chọn sai chức năng");
        }
        System.out.println("Đã sửa thành công");

    }

    //Các phương thức giúp code lười hơn
    public String getInputValue(String msg) {
        System.out.printf("Mời bạn nhập %s: ", msg);
        return _sc.nextLine();
    }

    public int getIndex() {
        _input = getInputValue("sdt");
        for (int i = 0; i < _lstNYMoi.size(); i++) {
            if (_lstNYMoi.get(i).getSdt().equals(_input)) {
                return i;
            }
        }
        return -5;
    }

}
