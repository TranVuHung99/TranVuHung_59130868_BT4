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
public class XeNoiThanh extends ChuyenXe{
    private int soTuyen;
    private double soKM;
    public XeNoiThanh(String maSo, String hoTen, String soXe, int soTuyen, double soKM, double doanhThu){
        super(maSo,hoTen,soXe,doanhThu);
        this.soTuyen=soTuyen;
        this.soKM=soKM;
    }
    @Override
    public void Xuat(){
        System.out.println("Mã Số: "+maSo+"\tHọ Tên: "+hoTen+"\tSố Xe: "+soXe+"\tSố tuyến: "+soTuyen+"\t Số KM: "+soKM+"\tDoanh Thu: "+doanhThu);
    }
}
