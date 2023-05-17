/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualanbarangminimarket;

/**
 *
 * @author USER
 */
public class Barang_Rusak {
    private int kode_barang;
    private int no_suplai;
    private int jml_rusak;
    
    public Barang_Rusak(){}//constructor

    public void setKode_barang(int kode_barang) {
        this.kode_barang = kode_barang;
    }

    public void setNo_suplai(int no_suplai) {
        this.no_suplai = no_suplai;
    }

    public void setJml_rusak(int jml_rusak) {
        this.jml_rusak = jml_rusak;
    }

    public int getKode_barang() {
        return kode_barang;
    }

    public int getNo_suplai() {
        return no_suplai;
    }

    public int getJml_rusak() {
        return jml_rusak;
    } 
}
