/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAUNDRY1;

/**
 *
 * @author LENOVO
 */


public class pembayaranmember {
    private int kode_vip;
    private int kode_pelanggan;
    private String tanggal_pembayaran;
    private int pembayaran;
    private String status_pembayaran;
    private int kode_user;
    private String tanggal_tempo;

    // Constructor
    public pembayaranmember(int kode_vip, int kode_pelanggan, String tanggal_pembayaran, int Pembayaran, String status_pembayaran, int kode_user, String tanggal_tempo  ) {
        this.kode_vip = kode_vip;
        this.kode_pelanggan = kode_pelanggan;
        this.tanggal_pembayaran = tanggal_pembayaran;
        this.pembayaran = Pembayaran;
        this.status_pembayaran = status_pembayaran;
        this.kode_user = kode_user;
        this.tanggal_tempo = tanggal_tempo;
    }

    // Getter dan Setter untuk properti
    public int getkode_vip() {
        return kode_vip;
    }

    public void setkode_vip(int kode_vip) {
        this.kode_vip = kode_vip;
    }

    public int getkode_pelanggan() {
        return kode_pelanggan;
    }

    public void setkode_pelanggan(int kode_pelanggan) {
        this.kode_pelanggan = kode_pelanggan;
    }

    public String gettanggal_pembayaran() {
        return tanggal_pembayaran;
    }

    public void settanggal_pembayaran(String tanggal_pembayaran) {
        this.tanggal_pembayaran = tanggal_pembayaran;
    }

    public int getpembayaran() {
        return pembayaran;
    }

    public void setpembayaran(int pembayaran) {
        this.pembayaran = pembayaran;
    }

    public String getstatus_pembayaran() {
        return status_pembayaran;
    }

    public void setstatus_pembayaran(String status_pembayaran) {
        this.status_pembayaran = status_pembayaran;
    }
    
    public int getkode_user() {
        return kode_user;
    }

    public void setkode_user(int kode_user) {
        this.kode_user = kode_user;
    }
    
    public String gettanggal_tempo() {
        return tanggal_tempo;
    }

    public void settanggal_tempo(String tanggal_tempo) {
        this.tanggal_tempo = tanggal_tempo;
    }
    
    // Method lain yang relevan
    public void pembayaranmember() {
        System.out.println("kode_vip: " + kode_vip);
        System.out.println("kode_pelanggan: " + kode_pelanggan);
        System.out.println("Tanggal Pembayaran: " + tanggal_pembayaran);
        System.out.println("pembayaran: " + pembayaran);
        System.out.println("status_pembayaran: " + status_pembayaran);
        System.out.println("kode_user: " + kode_user);
        System.out.println("tanggal_tempo: " + tanggal_tempo);
    }
    }    

