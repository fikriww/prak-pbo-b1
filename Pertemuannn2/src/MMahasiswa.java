// Class MMahasiswa (Main Class)
public class MMahasiswa {
    public static void main(String[] args) {
        Dosen dosen1 = new Dosen("12345", "Dr. Helmie", "Informatika");
        MataKuliah mk1 = new MataKuliah("IF101", "Pemrograman Dasar", 3);
        MataKuliah mk2 = new MataKuliah("IF102", "Struktur Data", 4);
        Kendaraan kendaraan1 = new Kendaraan("B 1234 XYZ", "Mobil");

        Mahasiswa mhs1 = new Mahasiswa("2201001", "Fikri", "Informatika");
        mhs1.setDosenWali(dosen1);
        mhs1.setKendaraan(kendaraan1);
        mhs1.addMatKul(mk1);
        mhs1.addMatKul(mk2);

        mhs1.printDetailMhs();
    }
}
