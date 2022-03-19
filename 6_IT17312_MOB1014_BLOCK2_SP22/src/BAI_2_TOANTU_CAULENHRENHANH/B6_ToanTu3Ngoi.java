/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI_2_TOANTU_CAULENHRENHANH;

/**
 *
 * @author dungna29
 */
public class B6_ToanTu3Ngoi {
 /*
    * TOÁN TỬ 3 NGÔI
    * <Điều kiện hoặc nhiều điều kiện> ? <Kết quả nếu điều kiện đúng> : <Kết quả nếu điều kiện sai>;
        */
    public static void main(String[] args) {
        String temp1 = 8 > 0 ? "Đúng" : "Sai";
        int temp2 = 8 > 0 ? 1 : 0;
        float temp3 = 8 > 0 ? 8.1f : 8.9f;
        boolean temp4 = 8 > 0 ? true : false;
        System.out.println(temp1);
        
        /*
            * Bài tập: Viết 1 chương trình khi nhập thông tin 1 người xác định được là ANH, CHỊ, EM, BẠN.
            * Cố định lại Tuổi và Giới Tính của bản thân
            */
            int namSinhBanThan = 2002, gioiTinh = 1;//Cố định 1 = Nam | 0 = Nữ
            //Yêu cầu nhập vào TÊN - NĂM SINH - GIỚI TÍNH có thể xác định được tên gọi như ở trên.
            //+1 điểm vào ASS1 ASS2 cho 4 bạn code nhanh và đúng nhất sử dụng toán tử 3 ngôi.
            String tenBan = "Hoàng";
            int nsBan = 2002, gtBan=0;//1 = Nam | 0 = Nữ
            
            System.out.println((nsBan < namSinhBanThan && gtBan ==1)?"Anh":
                    (nsBan < namSinhBanThan && gtBan ==0)?"Chị":
                            (nsBan > namSinhBanThan && gtBan ==1)?"Em Trai":
                                    (nsBan > namSinhBanThan && gtBan ==0)?"Em gái":"Bạn");
            

    }
}
