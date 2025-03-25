public class Dosen extends Karyawan {
    private static int counter = 0;
    private Fakultas fakultas;

    public Dosen(String nama, String email, String nip, int masaKerja, Fakultas fakultas) {
        super(nama, email, nip, masaKerja);
        this.fakultas = fakultas;
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public double hitungGaji() {
        double gajiPokok = fakultas.getGajiPokok();
        return gajiPokok + (masaKerja * 0.01 * gajiPokok);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Dosen:");
        System.out.println("Nama       : " + nama);
        System.out.println("Email      : " + email);
        System.out.println("NIP        : " + nip);
        System.out.println("Fakultas   : " + fakultas.getNama());
        System.out.println("Masa Kerja : " + masaKerja + " tahun");
        System.out.printf("Gaji       : Rp%.2f\n", hitungGaji());
        System.out.println();
    }
}