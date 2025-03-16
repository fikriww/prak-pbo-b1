/* Nama File : DosenTamu.java
 * Deskripsi : Berisi atribut dan method dalam subclass Dosen Tamu
 */

 import java.time.LocalDate;
 import java.time.format.DateTimeFormatter;
 import java.util.Locale;
 
 public class DosenTamu extends Dosen {
     private String nidk;
     private LocalDate tanggalAkhirKontrak;
 
     // Konstruktor
     public DosenTamu(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, int gajiPokok, String fakultas, String nidk, LocalDate tanggalAkhirKontrak) {
         super(nip, nama, tanggalLahir, tmt, gajiPokok, fakultas);
         this.nidk = nidk;
         this.tanggalAkhirKontrak = tanggalAkhirKontrak;
     }
 
     // Getter Setter
     public String getNidk() { 
         return nidk; 
     }
     public void setNidk(String nidk) { 
         this.nidk = nidk; 
     }
     public LocalDate getTanggalAkhirKontrak() { 
         return tanggalAkhirKontrak; 
     }
     public void setTanggalAkhirKontrak(LocalDate tanggalAkhirKontrak) { 
         this.tanggalAkhirKontrak = tanggalAkhirKontrak; 
     }
 
     public int hitungTunjangan() {
         return super.hitungTunjangan(0.025);
     }
 
     @Override
     public void printInfo() {
         super.printInfo();
         System.out.println("NIDK: " + nidk);
         DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d MMMM yyyy", new Locale("id", "ID"));
         System.out.println("Tanggal Akhir Kontrak: " + tanggalAkhirKontrak.format(formatter));
         System.out.println("Tunjangan: Rp " + hitungTunjangan());
     }
 }
