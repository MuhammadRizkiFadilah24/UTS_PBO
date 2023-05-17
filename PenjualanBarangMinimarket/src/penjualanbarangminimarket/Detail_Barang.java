/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualanbarangminimarket;

/**
 *
 * @author USER
 */
public class Detail_Barang {
    private int kode_barang;
    private int no_suplai;
    private int harga_jual;
    
    public Detail_Barang(){}//constructor

    public void setKode_barang(int kode_barang) {
        this.kode_barang = kode_barang;
    }

    public void setno_suplai(int no_suplai){
        this.no_suplai = no_suplai;
    }
    
    public void setHarga_jual(int harga_jual) {
        this.harga_jual = harga_jual;
    }

    public int getKode_barang() {
        return kode_barang;
    }

    public int getNo_suplai() {
        return no_suplai;
    }

    public int getHarga_jual() {
        return harga_jual;
    }   
}
