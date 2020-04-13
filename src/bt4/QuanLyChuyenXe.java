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
import bt4.XeNgoaiThanh;
import bt4.XeNoiThanh;        
import java.util.ArrayList;
public class QuanLyChuyenXe {
    ArrayList<ChuyenXe>dsChuyenXe = new ArrayList<>();
    public void themcx(ChuyenXe cx){
        dsChuyenXe.add(cx);
    }
    public void xuatds(){
        for(int i=0;i<dsChuyenXe.size();i++){
            System.out.println("\nChuyến Xe: "+(i+1));
            dsChuyenXe.get(i).Xuat();
        }
    }
    public double doanhthuNgoaiThanh(){
        double doanhthuNgoaiThanh=0;
        for(int i=0;i<dsChuyenXe.size();i++){
            XeNgoaiThanh ngt = dsChuyenXe.get(i) instanceof XeNgoaiThanh?((XeNgoaiThanh) dsChuyenXe.get(i)):null;
                if(ngt != null) 
                    doanhthuNgoaiThanh+= ngt.doanhThu;
        }
        return doanhthuNgoaiThanh;
    }
    public double doanhthuNoiThanh(){
        double doanhthuNoiThanh=0;
        for(int i=0;i<dsChuyenXe.size();i++){
            XeNoiThanh nt = dsChuyenXe.get(i) instanceof XeNoiThanh?((XeNoiThanh) dsChuyenXe.get(i)):null;
                if(nt != null) 
                    doanhthuNoiThanh+= nt.doanhThu;
        }
        return doanhthuNoiThanh;
    }
}
