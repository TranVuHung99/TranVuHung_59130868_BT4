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
public class XeNgoaiThanh extends ChuyenXe{
    private int soNgay;
    private String noiDen;
    public XeNgoaiThanh(String maSo, String hoTen, String soXe, int soNgay, String noiDen, double doanhThu){
        super(maSo,hoTen,soXe,doanhThu);
        this.soNgay=soNgay;
        this.noiDen=noiDen;
    }
    @Override
    public void Xuat(){
        System.out.println("Mã Số: "+maSo+"\tHọ Tên: "+hoTen+"\tSố Xe: "+soXe+"\tSố Ngay: "+soNgay+"\t Nơi Đến: "+noiDen+"\tDoanh Thu: "+doanhThu);
    }
}