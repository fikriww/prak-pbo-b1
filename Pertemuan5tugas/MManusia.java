/* Nama File : Main.java
 * Deskripsi : Main dalam class Main Manusia
 * Pembuat : Cipta Fikri Wiratama - 24060123140172 
 * Tanggal : Minggu, 23 Maret 2025
 */

public class MManusia {
    public static void main(String[] args) {
        PNS p1 = new PNS("Adi", "12-05-1985", "Jl. Merpati", 20000000, "198505122010051001");
        Pengusaha pe1 = new Pengusaha("Budi", "15-03-1978", "Jl. Kenanga", 60000000, "000-123-456-789-000-6");
        Petani pt1 = new Petani("Citra", "20-07-1982", "Jl. Melati 10", 7000000, "Magelang");
        PNS p2 = new PNS("Dewi", "05-11-1987", "Jl. Anggrek", 12000000, "198711052015051002");
        
        p2.setAlamat("Jl. Cendana 22 Semarang");
        
        System.out.println("======================= Statistik =======================");
        System.out.println("Jumlah Manusia = " + Manusia.getCounterMns());
        System.out.println("Jumlah PNS = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani = " + Petani.getCounterPetani());
        System.out.println("Pajak PNS p1 = " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1 = " + pt1.hitungPajak());
        System.out.println("Pajak PNS p2 = " + p2.hitungPajak());
        System.out.println("Masa Kerja p1 = " + p1.hitungMasaKerja());
        System.out.println("Masa Kerja pe1 = " + pe1.hitungMasaKerja());
        System.out.println("Masa Kerja pt1 = " + pt1.hitungMasaKerja());
        System.out.println("Masa Kerja p2 = " + p2.hitungMasaKerja());
        System.out.println();

        System.out.println("======================= Biodata =======================");
        p1.cetakInfo();
        System.out.println();
        pe1.cetakInfo();
        System.out.println();
        pt1.cetakInfo();
        System.out.println();
        p2.cetakInfo();
    }
}