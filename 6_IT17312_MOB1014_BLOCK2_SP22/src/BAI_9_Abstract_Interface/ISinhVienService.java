/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package BAI_9_Abstract_Interface;

/**
 *
 * @author dungna29
 */
public interface ISinhVienService {
    /*
    1. Trong interface không thể sử dụng private
    2. Mặc định trong interface là public
    3. Các phương thức bên trong interface đều là abstract
    */
    void themSV();
    int suaSV(SinhVien sv);
    public void inDSSV();
}
