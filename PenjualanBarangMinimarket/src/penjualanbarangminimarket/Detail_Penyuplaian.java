/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualanbarangminimarket;

/**
 *
 * @author USER
 */
public class Detail_Penyuplaian {
    private int no_suplai;
    private int kode_barang;
    private int harga_jual;
    private int jml_suplai;
    
    public Detail_Penyuplaian(){}//constructor

    public void setNo_suplai(int no_suplai) {
        this.no_suplai = no_suplai;
    }

    public void setKode_barang(int kode_barang) {
        this.kode_barang = kode_barang;
    }

    public void setHarga_jual(int harga_jual) {
        this.harga_jual = harga_jual;
    }

    public void setJml_suplai(int jml_suplai) {
        this.jml_suplai = jml_suplai;
    }

    public int getNo_suplai() {
        return no_suplai;
    }

    public int getKode_barang() {
        return kode_barang;
    }

    public int getHarga_jual() {
        return harga_jual;
    }

    public int getJml_suplai() {
        return jml_suplai;
    }  
}
