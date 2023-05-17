/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package penjualanbarangminimarket;

/**
 *
 * @author USER
 */
public class Penyuplaian {
    private int no_suplai;
    private String tgl_suplai;
    private int id_pemasok;
    
    public Penyuplaian(){}//constructor

    public void setNo_suplai(int no_suplai) {
        this.no_suplai = no_suplai;
    }

    public void setTgl_suplai(String tgl_suplai) {
        this.tgl_suplai = tgl_suplai;
    }

    public void setId_pemasok(int id_pemasok) {
        this.id_pemasok = id_pemasok;
    }

    public int getNo_suplai() {
        return no_suplai;
    }

    public String getTgl_suplai() {
        return tgl_suplai;
    }

    public int getId_pemasok() {
        return id_pemasok;
    }

    
}
