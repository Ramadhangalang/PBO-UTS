/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAUNDRY1;

/**
 *
 * @author LENOVO
 */

import java.util.Date;

public class transaksi {
    private int kode_transaksi;
    private int idPelanggan;
    private int idLayanan;
    private String tanggalTransaksi;
    private String totalHarga;

    // Constructor
    public transaksi(int kode_transaksi, int idPelanggan, int idLayanan, String tanggalTransaksi, String totalHarga) {
        this.kode_transaksi = kode_transaksi;
        this.idPelanggan = idPelanggan;
        this.idLayanan = idLayanan;
        this.tanggalTransaksi = tanggalTransaksi;
        this.totalHarga = totalHarga;
    }

    // Getter dan Setter untuk properti
    public int getkode_transaksi() {
        return kode_transaksi;
    }

    public void setkode_transaksi(int kode_transaksi) {
        this.kode_transaksi = kode_transaksi;
    }

    public int getIdPelanggan() {
        return idPelanggan;
    }

    public void setIdPelanggan(int idPelanggan) {
        this.idPelanggan = idPelanggan;
    }

    public int getIdLayanan() {
        return idLayanan;
    }

    public void setIdLayanan(int idLayanan) {
        this.idLayanan = idLayanan;
    }

    public String getTanggalTransaksi() {
        return tanggalTransaksi;
    }

    public void setTanggalTransaksi(String tanggalTransaksi) {
        this.tanggalTransaksi = tanggalTransaksi;
    }

    public String getTotalHarga() {
        return totalHarga;
    }

    public void setTotalHarga(String totalHarga) {
        this.totalHarga = totalHarga;
    }

    // Method lain yang relevan
    public void tampilkantransaksi() {
        System.out.println("kode_transaksi: " + kode_transaksi);
        System.out.println("ID Pelanggan: " + idPelanggan);
        System.out.println("ID Layanan: " + idLayanan);
        System.out.println("Tanggal Transaksi: " + tanggalTransaksi);
        System.out.println("Total Harga: " + totalHarga);
    }
}
