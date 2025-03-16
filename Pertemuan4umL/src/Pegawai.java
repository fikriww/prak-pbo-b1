/* Nama File : Pegawai.java
 * Deskripsi : Berisi atribut dan method dalam class Super Pegawai
 */

 import java.time.LocalDate;
 import java.time.Period;
 import java.time.format.DateTimeFormatter;
 import java.util.Locale;
 
 public class Pegawai {
     private String nip;
     private String nama;
     private LocalDate tanggalLahir;
     private LocalDate tmt;
     private int gajiPokok;
 
     // Konstruktor
     public Pegawai(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, int gajiPokok) {
         this.nip = nip;
         this.nama = nama;
         this.tanggalLahir = tanggalLahir;
         this.tmt = tmt;
         this.gajiPokok = gajiPokok;
     }
 
     // Getter Setter
     public String getNip() { 
         return nip; 
     }
     public void setNip(String nip) { 
         this.nip = nip; 
     }
 
     public String getNama() { 
         return nama; 
     }
     public void setNama(String nama) { 
         this.nama = nama; 
     }
 
     public LocalDate getTanggalLahir() { 
         return tanggalLahir; 
     }
     public void setTanggalLahir(LocalDate tanggalLahir) { 
         this.tanggalLahir = tanggalLahir; 
     }
 
     public LocalDate getTmt() { 
         return tmt; 
     }
     public void setTmt(LocalDate tmt) { 
         this.tmt = tmt; 
     }
 
     public int getGajiPokok() { 
         return gajiPokok; 
     }
     public void setGajiPokok(int gajiPokok) { 
         this.gajiPokok = gajiPokok; 
     }
 
     public String hitungMasaKerja() {
         Period period = Period.between(tmt, LocalDate.now());
         return period.getYears() + " tahun " + period.getMonths() + " bulan";
     }
 
     public int hitungTunjangan(double persen) {
         return (int) (persen * Period.between(tmt, LocalDate.now()).getYears() * gajiPokok);
     }
 
     public void printInfo() {
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
         System.out.println("NIP: " + nip);
         System.out.println("Nama: " + nama);
         System.out.println("Tanggal Lahir: " + tanggalLahir.format(formatter));
         System.out.println("TMT: " + tmt.format(formatter));
         System.out.println("Masa Kerja: " + hitungMasaKerja());
         System.out.println("Gaji Pokok: Rp " + gajiPokok);
     }
 }
