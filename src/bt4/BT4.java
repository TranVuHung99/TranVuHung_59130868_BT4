/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bt4;

/**
 *
 * @author KimKhanh
 */
import bt4.QuanLyChuyenXe;
public class BT4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                
        QuanLyChuyenXe DS = new QuanLyChuyenXe();
        XeNgoaiThanh xng = new XeNgoaiThanh("NT01","Hùng","H-3970",2,"Ninh Hòa",100000);
        XeNgoaiThanh xng1 = new XeNgoaiThanh("VH01","Lâm","k-3579",2,"Kiên Giang",300000);
        XeNgoaiThanh xng2 = new XeNgoaiThanh("NT02","Bảo","I-2950",2,"Lâm Đồng",400000);
        
        XeNoiThanh xn = new XeNoiThanh("NT04","Bình","I-2950",6,5,60000);
        XeNoiThanh xn1 = new XeNoiThanh("NT05","Linh","I-2950",9,2,30000);
        XeNoiThanh xn2 = new XeNoiThanh("NT06","Thông","I-2950",7,3,40000);
        
        DS.themcx(xng);
        DS.themcx(xng1);
        DS.themcx(xng2);
        DS.themcx(xn);
        DS.themcx(xn1);
        DS.themcx(xn2);
        DS.xuatds();
        System.out.println("Tổng doanh thu ngoại thành: " +DS.doanhthuNgoaiThanh());
        System.out.println("Tổng doanh thu nội thành: " +DS.doanhthuNoiThanh());
        
    }
    
}
