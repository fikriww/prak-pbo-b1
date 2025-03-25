public class Mahasiswa extends CivitasAkademika {
    private static int counter = 0;
    private String nim;
    private int semester;
    private Fakultas fakultas;

    public Mahasiswa(String nama, String email, String nim, int semester, Fakultas fakultas) {
        super(nama, email);
        this.nim = nim;
        this.semester = semester;
        this.fakultas = fakultas;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public double hitungUKT() {
        return fakultas.getTarifUKT() * Math.pow(0.95, semester - 1);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Mahasiswa:");
        System.out.println("Nama     : " + nama);
        System.out.println("Email    : " + email);
        System.out.println("NIM      : " + nim);
        System.out.println("Semester : " + semester);
        System.out.println("Fakultas : " + fakultas.getNama());
        System.out.printf("Biaya UKT: Rp%.2f\n", hitungUKT());
        System.out.println();
    }
}