/* Nama File : Manusia.java
 * Deskripsi : Atribut dan method dalam subclass Petani
 * Pembuat : Cipta Fikri Wiratama - 24060123140172 
 * Tanggal : Minggu, 23 Maret 2025
 */
import java.util.Date;
public class Petani extends Manusia implements Pajak {
    private String asal_kota;
    private static int counterPetani;
    private static final int C = 1;

    public Petani(String nama, String tgl_mulai_kerja, String alamat, double pendapatan, String asal_kota) {
        super(nama, tgl_mulai_kerja, alamat, pendapatan);
        this.asal_kota = asal_kota;
        Petani.counterPetani++;
    }
    
    public String getAsalKota() {
        return asal_kota;
    }

    public void setAsalKota(String asal_kota) {
        this.asal_kota = asal_kota;
    }

    public static int getCounterPetani() {
        return counterPetani; 
    }
    
    @Override
    public int hitungMasaKerja() {
        return new Date().getYear() - tgl_mulai_kerja.getYear() + C;
    }
    
    @Override
    public String hitungPajak() {
        return formatRupiah(0);
    }
}