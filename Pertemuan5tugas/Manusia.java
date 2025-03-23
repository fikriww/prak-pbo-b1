/* Nama File : Manusia.java
 * Deskripsi : Atribut dan method dalam class super Manusia
 * Pembuat : Cipta Fikri Wiratama - 24060123140172 
 * Tanggal : Minggu, 23 Maret 2025
 */

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;                                                                     

// Abstract class Manusia
public abstract class Manusia {
    protected String nama;
    protected Date tgl_mulai_kerja;
    protected String alamat;
    protected double pendapatan;
    protected static int counterMns;

    public Manusia(String nama, String tgl_mulai_kerja, String alamat, double pendapatan){
        try {
            this.tgl_mulai_kerja = new SimpleDateFormat("dd-MM-yyyy").parse(tgl_mulai_kerja);
        } catch (Exception e) {
            this.tgl_mulai_kerja = new Date();
        }
        this.nama = nama;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterMns++;
    }
    
    public String getNama() {
        return nama; 
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    
    public Date getTglMulaiKerja() {
        return tgl_mulai_kerja;
    }
    public void setTglMulaiKerja(Date tgl_mulai_kerja) {
        this.tgl_mulai_kerja = tgl_mulai_kerja; 
    }
    
    public String getAlamat() {
        return alamat; 
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
    
     public String formatRupiah(double amount) {
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        return formatRupiah.format(amount);
    }

    public String getPendapatan() {
        return formatRupiah(pendapatan);
    }
    
    public void setPendapatan(double pendapatan) {
        this.pendapatan = pendapatan;
    }

    public static int getCounterMns() {
        return counterMns;
    }
    
    public abstract int hitungMasaKerja();
    
    public void cetakInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Tanggal Mulai Kerja: " + tgl_mulai_kerja);
        System.out.println("Alamat: " + alamat);
        System.out.println("Pendapatan: " + getPendapatan());
    }
}