public class Tendik extends Karyawan {
    private static int counter = 0;

    public Tendik(String nama, String email, String nip, int masaKerja) {
        super(nama, email, nip, masaKerja);
        counter++;
    }

    public static int getCounter() {
        return counter;
    }

    @Override
    public double hitungGaji() {
        double gajiPokok = 4000000;
        return gajiPokok + (masaKerja * 0.01 * gajiPokok);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("Tendik:");
        System.out.println("Nama       : " + nama);
        System.out.println("Email      : " + email);
        System.out.println("NIP        : " + nip);
        System.out.println("Masa Kerja : " + masaKerja + " tahun");
        System.out.printf("Gaji       : Rp%.2f\n", hitungGaji());
        System.out.println();
    }
}