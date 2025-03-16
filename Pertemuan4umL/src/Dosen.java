/* Nama File : Dosen.java
 * Deskripsi : Berisi atribut dan method dalam subclass Dosen dari class Pegawai
 * Pembuat : Gaza Al Ghozali Chansa / 24060123140183
 * Tanggal : Selasa, 12 Maret 2025
 */

 import java.time.LocalDate;
 public class Dosen extends Pegawai {
     private String fakultas;
 
     // Konstruktor
     public Dosen(String nip, String nama, LocalDate tanggalLahir, LocalDate tmt, int gajiPokok, String fakultas) {
         super(nip, nama, tanggalLahir, tmt, gajiPokok);
         this.fakultas = fakultas;
     }
 
     // Getter Setter
     public String getFakultas() { 
         return fakultas; 
     }
     public void setFakultas(String fakultas) { 
         this.fakultas = fakultas; 
     }
 
     @Override
     public void printInfo() {
         super.printInfo();
         System.out.println("Fakultas: " + fakultas);
     }
 }