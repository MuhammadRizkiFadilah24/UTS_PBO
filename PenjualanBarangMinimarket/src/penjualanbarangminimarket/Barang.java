/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualanbarangminimarket;

/**
 *
 * @author USER
 */
public class Barang {
    private int kode_barang;
    private String nama_barang;
    private String satuan;
    
    public Barang(){}//constructor

    public void setKode_barang(int kode_barang) {
        this.kode_barang = kode_barang;
    }

    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
    }

    public void setSatuan(String satuan) {
        this.satuan = satuan;
    }

    public int getKode_barang() {
        return kode_barang;
    }

    public String getNama_barang() {
        return nama_barang;
    }

    public String getSatuan() {
        return satuan;
    }

    
}
