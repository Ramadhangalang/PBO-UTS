/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laundry;
import LAUNDRY1.Pelanggan;
import LAUNDRY1.detail_transaksi;
import LAUNDRY1.pembayaranmember;
import LAUNDRY1.pengguna;
import LAUNDRY1.rugi;
import LAUNDRY1.tarif;
import LAUNDRY1.transaksi;
/**
 *
 * @author LENOVO
 */
public class Laundry {
    
    public static void main(String[] args) {
        // Membuat objek pelanggan
        Pelanggan Pelanggan = new Pelanggan(1, "Galang", "Jl. Sudirman 123", "081234567890", "Lunas");
        Pelanggan.tampilkanpelanggan();
        
        detail_transaksi detail_transaksi = new detail_transaksi(88, 2,44);
        detail_transaksi.detail_transaksi();
        
        pembayaranmember pembayaranmember = new pembayaranmember(24, 1, "17 april", 8000, "LUNAS", 7, "18 april");
        pembayaranmember.pembayaranmember();
        
        pengguna pengguna = new pengguna(0, "namaPengguna", "username", "password");
        pengguna.tampilkanpengguna();
        
        rugi rugi = new rugi(0, 0, 0, 0);
        rugi.tampiluangrugi();
        
        tarif tarif = new tarif(0, "Kemeja", 0, "Cuci Setrika", "B");
        tarif.tampilkantarif();
        
        transaksi transaksi = new transaksi(0, 0, 0, "tanggalTransaksi", "");
        transaksi.tampilkantransaksi();
        
        
        

        
}

    
    
}
