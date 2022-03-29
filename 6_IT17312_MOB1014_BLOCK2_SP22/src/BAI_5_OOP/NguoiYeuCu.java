/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_5_OOP;

/**
 *
 * @author dungna29
 */
//class = Lớp => Tạo đối tượng và tên đối tượng bắt buộc phải viết hoa chữ cái đầu.
public class NguoiYeuCu {
    //Phần 1: Liệt kê các thuộc tính mà đối tượng cần
    private String ten;
    private int ns;
    private double v1;
    private double v2;
    private double v3;
    private String soThich;
    private String truongHoc = "FPOLY";
    
    //Phần 2 Contructor và sẽ có 2 loại có tham số và không tham số
    /*
        - Tên Contructor phải giống với tên class và có từ khóa public
        - Khi khởi tạo đối tượng thì Contructor luôn là thành phần chạy đầu tiên trong class đối tượng đó.
        - Contructor không tham số dùng để khởi tạo đối tượng ko có giá trị ban đầu
        - Contructor có tham số  để khởi tạo đối tượng có ngay giá trị
        - Nếu khi khởi tạo đối tượng mà đối tượng không có contructor nào thì chương trình sẽ tự động khởi tạo cho đối tượng đó 1 contructor mặc định đó là contructor không tham số.
 */
 
  //2.1 Contructor không tham số: Alt + insert hoặc chuột phải chọn Insert code.->Contructor

    public NguoiYeuCu() {
//        System.out.println("Chạy vào đây");
    }

 //2.2 Contructor có tham số: Alt + insert hoặc chuột phải chọn Insert code.->Contructor - Select All

    public NguoiYeuCu(String ten1, int ns, double v1, double v2, double v3, String soThich, String truongHoc) {
        ten = ten1;
        this.ns = ns;
        this.v1 = v1;
        this.v2 = v2;
        this.v3 = v3;
        this.soThich = soThich;
        this.truongHoc = truongHoc;
        //this: Dùng để tham chiếu đến thuộc tính và phương thức của lớp hiện tại
    }
    
   //Phần 3:Getter và Setter Vì khi thuộc tính bị Private muốn lấy và gán giá trị cho nó thì phải sử dụng
  // Alt + Insert chọn Getter và Setter -> Select All

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getNs() {
        return ns;
    }

    public void setNs(int ns) {
        this.ns = ns;
    }

    public double getV1() {
        return v1;
    }

    public void setV1(double v1) {
        this.v1 = v1;
    }

    public double getV2() {
        return v2;
    }

    public void setV2(double v2) {
        this.v2 = v2;
    }

    public double getV3() {
        return v3;
    }

    public void setV3(double v3) {
        this.v3 = v3;
    }

    public String getSoThich() {
        return soThich;
    }

    public void setSoThich(String soThich) {
        this.soThich = soThich;
    }

    public String getTruongHoc() {
        return truongHoc;
    }

    public void setTruongHoc(String truongHoc) {
        this.truongHoc = truongHoc;
    }
    
    //Phần 4: Triển khai phương thức
    public void inRaManHinh(){
        System.out.printf("%s | %d | %f | %f | %f | %s | %s\n",ten,ns,v1,v2,v3,soThich,truongHoc);
    }
  
}
