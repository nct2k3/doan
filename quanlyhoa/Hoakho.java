/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyhoa;

/**
 *
 * @author HP
 */

public class Hoakho {
    public String ten,mahoa,mau,loaihoa;
    public int soluong;

    public Hoakho(String ten, String mahoa, String mau, String loaihoa, int soluong) {
        this.ten = ten;
        this.mahoa = mahoa;
        this.mau = mau;
        this.loaihoa = loaihoa;
        this.soluong = soluong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getMahoa() {
        return mahoa;
    }

    public void setMahoa(String mahoa) {
        this.mahoa = mahoa;
    }

    public String getMau() {
        return mau;
    }

    public void setMau(String mau) {
        this.mau = mau;
    }

    public String getLoaihoa() {
        return loaihoa;
    }

    public void setLoaihoa(String loaihoa) {
        this.loaihoa = loaihoa;
    }

    public int getSoluong() {
        return soluong;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    @Override
    public String toString() {
        return "Hoakho{" + "ten=" + ten + ", mahoa=" + mahoa + ", mau=" + mau + ", loaihoa=" + loaihoa + ", soluong=" + soluong + '}';
    }
    
    
    
}
