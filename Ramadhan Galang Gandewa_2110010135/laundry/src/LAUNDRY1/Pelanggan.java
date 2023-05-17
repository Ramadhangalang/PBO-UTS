/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAUNDRY1;

/**
 *
 * @author LENOVO
 */

   
public class Pelanggan {
    private int kode_pelanggan;
    private String nama_pelanggan;
    private String alamat_pelanggan;
    private String telepon_pelanggan;
    private String status_pelanggan;

    public Pelanggan(int kode_pelanggan, String nama_pelanggan, String alamat_pelanggan, String telepon_pelanggan, String status_pelanggan) {
        this.kode_pelanggan = kode_pelanggan;
        this.nama_pelanggan = nama_pelanggan;
        this.alamat_pelanggan = alamat_pelanggan;
        this.telepon_pelanggan = telepon_pelanggan;
        this.status_pelanggan = status_pelanggan;
    }

    public int getKodepelanggan(){
        return kode_pelanggan;
    }
    public void setKodepelanggan(int kode_pelanggan) {
        this.kode_pelanggan = kode_pelanggan;
    }
            
    public String getNamapelanggan() {
        return nama_pelanggan;
    }

    public void setNamapelanggan(String nama_pelanggan) {
        this.nama_pelanggan = nama_pelanggan;
    }

    public String getAlamatpelanggan() {
        return alamat_pelanggan;
    }

    public void setAlamatpelanggan(String alamat_pelanggan) {
        this.alamat_pelanggan = alamat_pelanggan;
    }

    public String getTelepon_pelanggan() {
        return telepon_pelanggan;
    }

    public void setTeleponpelanggan(String telepon_pelanggan) {
        this.telepon_pelanggan = telepon_pelanggan;
    }
    
    public String getStatus_pelanggan() {
        return status_pelanggan;
    }
    
    public void setStatuspelanggan(String status_pelanggan) {
        this.status_pelanggan = status_pelanggan;
    }
    
    public void tampilkanpelanggan() {
        System.out.println("kode pelanggan: " + kode_pelanggan);
        System.out.println("nama pelanggan: " + nama_pelanggan);
        System.out.println("alamat pelanggan: " + alamat_pelanggan);
        System.out.println("telepon pelanggan: " + telepon_pelanggan);
        System.out.println("status_pelanggan: "+ status_pelanggan );
    }
    
 }
