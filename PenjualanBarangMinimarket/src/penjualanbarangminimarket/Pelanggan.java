/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualanbarangminimarket;

/**
 *
 * @author USER
 */
public class Pelanggan {
    private int id_pelanggan;
    private String nama;
    private String alamat;
    private String telp;
    
    public Pelanggan(){}//constructor

    public void setId_pelanggan(int id_pelanggan) {
        this.id_pelanggan = id_pelanggan;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setTelp(String telp) {
        this.telp = telp;
    }

    public int getId_pelanggan() {
        return id_pelanggan;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getTelp() {
        return telp;
    }

   
}
