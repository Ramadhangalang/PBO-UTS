/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAUNDRY1;

/**
 *
 * @author LENOVO
 */
public class detail_transaksi {
    private int kode_transaksi;
    private int jumlah;
    private int kode_tarif;

    // Constructor
    public detail_transaksi(int kode_transaksi, int jumlah, int kode_tarif) {
        this.kode_transaksi = kode_transaksi;
        this.jumlah = jumlah;
        this.kode_tarif = kode_tarif;
        
    }

    // Getter dan Setter untuk properti
    public int getkode_transaksi() {
        return kode_transaksi;
    }

    public void setkode_transaksi(int kode_transaksi) {
        this.kode_transaksi = kode_transaksi;
    }

    public int getjumlah() {
        return jumlah;
    }

    public void setjumlah(int jumlah) {
        this.jumlah = jumlah;
    }

    public int getkode_tarif() {
        return kode_tarif;
    }

    public void setkode_tarif(int kode_tarif) {
        this.kode_tarif= kode_tarif;
    }

   

    public void detail_transaksi() {
        System.out.println("kode_transaksi: " + kode_transaksi);
        System.out.println("jumlah: " + jumlah);
        System.out.println("kode_tarif: " + kode_tarif);
    }

    public detail_transaksi() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

    

