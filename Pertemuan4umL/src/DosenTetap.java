/* Nama File : DosenTetap.java
 * Deskripsi : Berisi atribut dan method dalam subclass Dosen Tetap
 */

 import java.time.LocalDate;
 import java.time.format.DateTimeFormatter;
 import java.time.temporal.TemporalAdjusters;
 import java.util.Locale;
 
 public class DosenTetap extends Dosen {
     private String nidn;
     private int bup = 65;
 
     // Konstruktor
     public DosenTetap(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, int gajiPokok, String fakultas, String nidn) {
         super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
         this.nidn = nidn;
     }
 
     // Getter Setter
     public String getNidn() { 
         return nidn; 
     }
     public void setNidn(String nidn) { 
         this.nidn = nidn; 
     }
 
     public int hitungTunjangan() {
         return super.hitungTunjangan(0.02);
     }
 
     public void printBUP() {
         LocalDate bupDate = getTanggalLahir().plusYears(bup).with(TemporalAdjusters.firstDayOfNextMonth());
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
         System.out.println("BUP Dosen Tetap: " + bupDate.format(formatter));
     }
 
     @Override
     public void printInfo() {
         super.printInfo();
         System.out.println("NIDN: " + nidn);
         System.out.println("Tunjangan: Rp " + hitungTunjangan());
         printBUP();
     }
 }
