/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LAUNDRY1;

/**
 *
 * @author LENOVO
 */

public class tarif {
    private int kode_tarif;
    private String nama_pakaian;
    private int tarif;
    private String jenis_laundry;
    private String paket;

    public tarif(int kode_tarif, String nama_pakaian, int tarif, String jenis_laundry, String paket ) {
        this.kode_tarif = kode_tarif;
        this.nama_pakaian = nama_pakaian;
        this.tarif = tarif; 
        this.jenis_laundry = jenis_laundry;
        this.paket= paket;
    }

    public int getkode_tarif() {
        return kode_tarif;
    }

    public void setkode_tarif(int kode_tarif) {
        this.kode_tarif = kode_tarif;
    }

    public String getnama_pakaian() {
        return nama_pakaian;
    }

    public void setnama_pakaian (String nama_pakaian) {
        this.nama_pakaian = nama_pakaian;
    }
    
    public int gettarif() {
        return tarif;
    }

    public void settarif (int tarif) {
        this.tarif = tarif;
    }
    
    public String getjenis_laundry() {
        return jenis_laundry;
    }

    public void setjenis_laundry (String jenis_laundry) {
        this.jenis_laundry = jenis_laundry;
    }
    
     public String getpaket() {
        return paket;
    }

    public void setpaket (String paket) {
        this.paket = paket;
    }

    public void tampilkantarif() {
        System.out.println("kode tarif: " + kode_tarif);
        System.out.println("nama pakaian: " + nama_pakaian);
        System.out.println("tarif: " + tarif);
        System.out.println("jenis laundry: " + jenis_laundry);
        System.out.println("paket: " + paket);
    }
}
