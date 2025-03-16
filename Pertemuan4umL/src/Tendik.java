/* Nama File : DosenTetap.java
 * Deskripsi : Berisi atribut dan method dalam subclass Dosen Tetap
 * Pembuat : Gaza Al Ghozali Chansa / 24060123140183
 * Tanggal : Selasa, 12 Maret 2025
 */

 import java.time.LocalDate;
 import java.time.format.DateTimeFormatter;
 import java.util.Locale;
 import java.time.temporal.TemporalAdjusters;
 
 public class Tendik extends Pegawai {
     private String bidang;
     private int bup = 55;
 
     // Konstruktor
     public Tendik(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, int gajiPokok, String bidang) {
         super(nip, nama, tanggalLahir, tmt, gajiPokok);
         this.bidang = bidang;
     }
 
     // Getter Setter
     public String getBidang() {
         return bidang;
     }
     public void setBidang(String bidang) {
         this.bidang = bidang;
     }
 
     public int hitungTunjangan() {
         return super.hitungTunjangan(0.01);
     }
 
     public void printBUP() {
         LocalDate bupDate = getTanggalLahir().plusYears(bup).with(TemporalAdjusters.firstDayOfNextMonth());
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
         System.out.println("BUP Tendik: " + bupDate.format(formatter));
     }
 
     @Override
     public void printInfo() {
         super.printInfo();
         System.out.println("Bidang: " + bidang);
         System.out.println("Tunjangan: Rp " + hitungTunjangan());
         printBUP();
     }
 }