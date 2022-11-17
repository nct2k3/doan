/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quanlyhoa;

/**
 *
 * @author HP
 */
public class hoada extends Hoakho{
    public int sohoacon;


    public hoada(int sohoacon, String ten, String mahoa, String mau, String loaihoa, int soluong) {
        super(ten, mahoa, mau, loaihoa, soluong);
        this.sohoacon = sohoacon;
    }

    public int getSohoacon() {
        return sohoacon;
    }

    public void setSohoacon(int sohoacon) {
        this.sohoacon = sohoacon;
    }

    @Override
    public String toString() {
        return "hoada{" + "sohoacon=" + sohoacon + '}';
    }
    
    
    
    
    
    
}
