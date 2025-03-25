public class Main {
    public static void main(String[] args) {
        Fakultas teknik = new Fakultas("Teknik", 6000000, 7000000);
        Fakultas ekonomi = new Fakultas("Ekonomi", 5000000, 6000000);

        Mahasiswa m1 = new Mahasiswa("Fikri", "fikri@students.undip.ac.id", "220001", 3, teknik);
        Mahasiswa m2 = new Mahasiswa("Subianto", "subianto@students.undip.ac.id", "220002", 5, ekonomi);

        Dosen d1 = new Dosen("Pak Teddy", "teddy@undip.ac.id", "D001", 10, teknik);
        Tendik t1 = new Tendik("Pak Gibran", "gibran@undip.ac.id", "T001", 7);

        m1.tampilkanInfo();
        m2.tampilkanInfo();
        d1.tampilkanInfo();
        t1.tampilkanInfo();

        System.out.println("Total Mahasiswa: " + Mahasiswa.getCounter());
        System.out.println("Total Dosen    : " + Dosen.getCounter());
        System.out.println("Total Tendik   : " + Tendik.getCounter());
    }
}