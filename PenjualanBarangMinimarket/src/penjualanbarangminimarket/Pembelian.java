/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualanbarangminimarket;

/**
 *
 * @author USER
 */
public class Pembelian {
    private int no_beli;
    private String tgl_beli;
    private int id_pelanggan;

    public Pembelian(){}//constructor
    
    public void setNo_beli(int no_beli) {
        this.no_beli = no_beli;
    }

    public void setTgl_beli(String tgl_beli) {
        this.tgl_beli = tgl_beli;
    }

    public void setId_pelanggan(int id_pelanggan) {
        this.id_pelanggan = id_pelanggan;
    }

    public int getNo_beli() {
        return no_beli;
    }

    public String getTgl_beli() {
        return tgl_beli;
    }

    public int getId_pelanggan() {
        return id_pelanggan;
    }     
}
