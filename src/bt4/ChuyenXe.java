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
public abstract class ChuyenXe {
    public String maSo;
    public String hoTen;
    public String soXe;
    public double doanhThu;
    public ChuyenXe(String maSo, String hoTen, String soXe, double doanhThu){
        this.maSo=maSo;
        this.hoTen=hoTen;
        this.soXe=soXe;
        this.doanhThu=doanhThu;     
    }

    public abstract void Xuat();
}

