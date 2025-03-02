import java.util.ArrayList;

public class Mahasiswa {
    /******ATRIBUT*********/
    private String nim;
    private String nama;
    private String prodi;
    private ArrayList<MataKuliah> listMatKul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    /*********METHOD********/

    // Konstruktor tanpa parameter
    public Mahasiswa() {
        this.nim = "";
        this.nama = "";
        this.prodi = "";
        this.listMatKul = new ArrayList<>(); // inisialisasi ArrayList kosong
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    public void addMatKul(MataKuliah newMatKul) {
        listMatKul.add(newMatKul);
    }

    public void printDetailMhs() {
        System.out.println("NIM: " + nim);
        System.out.println("Nama: " + nama);
        System.out.println("Prodi: " + prodi);
        System.out.println("Dosen Wali: ");
        dosenWali.printDosen();
        System.out.println("Kendaraan: ");
        kendaraan.printKendaraan();
        System.out.println("Mata Kuliah yang diambil: ");
        for (MataKuliah matkul : listMatKul) {
            matkul.printMatKul();
        }
    }
}
