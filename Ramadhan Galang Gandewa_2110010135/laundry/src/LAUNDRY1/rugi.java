/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAUNDRY1;

/**
 *
 * @author LENOVO
 */
public class rugi {
    private int kode_transaksi;
    private int kode_tarif;
    private int jumlah;
    private int uangrugi;

    public rugi(int kode_transaksi, int kode_tarif, int jumlah, int uangrugi) {
        this.kode_transaksi = kode_transaksi;
        this.kode_tarif = kode_tarif;
        this.jumlah = jumlah;
        this.uangrugi = uangrugi;
    }

    public int getkode_transaksi() {
        return kode_transaksi;
    }

    public void setkode_transakasi(int kode_transaksi) {
        this.kode_transaksi = kode_transaksi;
    }
    
    public int getkode_tarif() {
        return kode_tarif;
    }

    public void setkode_tarif(int kode_tarif) {
        this.kode_tarif = kode_tarif;
    }
    
    public int getjumlah() {
        return jumlah;
    }

    public void setjumlahi(int jumlah) {
        this.jumlah = jumlah;
    }
    
    public int uangrugi() {
        return uangrugi;
    }

    public void setuangrugi(int uangrugi) {
        this.uangrugi = uangrugi;
    }
    
    public void tampiluangrugi() {
        System.out.println("kode transaksi: " + kode_transaksi);
        System.out.println("kode tarif: " + kode_tarif);
        System.out.println("nama jumlah: " + jumlah);
        System.out.println("uangrugi: " + uangrugi);
    }
    
}
