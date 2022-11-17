/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyhoa;

/**
 *
 * @author HP
 */
public class hoadon extends Hoakho{
    public int socanhhoa;

    public hoadon(int socanhhoa, String ten, String mahoa, String mau, String loaihoa, int soluong) {
        super(ten, mahoa, mau, loaihoa, soluong);
        this.socanhhoa = socanhhoa;
    }

    public int getSocanhhoa() {
        return socanhhoa;
    }

    public void setSocanhhoa(int socanhhoa) {
        this.socanhhoa = socanhhoa;
    }

    @Override
    public String toString() {
        return "hoadon{" + "socanhhoa=" + socanhhoa + '}';
    }
    
    
    
}
