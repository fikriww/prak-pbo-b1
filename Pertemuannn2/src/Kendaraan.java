public class Kendaraan {
    // Atribut
    private String noPlat;
    private String jenis; // Bisa "motor" atau "mobil"

    // Konstruktor tanpa parameter
    public Kendaraan() {
        this.noPlat = "";
        this.jenis = "";
    }

    // Konstruktor dengan parameter
    public Kendaraan(String noPlat, String jenis) {
        if (jenis.equalsIgnoreCase("motor") || jenis.equalsIgnoreCase("mobil")) {
            this.noPlat = noPlat;
            this.jenis = jenis;
        } else {
            throw new IllegalArgumentException("Jenis kendaraan harus 'motor' atau 'mobil'");
        }
    }

    // Getter (Selektor)
    public String getNoPlat() {
        return noPlat;
    }

    public String getJenis() {
        return jenis;
    }

    // Setter (Mutator)
    public void setNoPlat(String noPlat) {
        this.noPlat = noPlat;
    }

    public void setJenis(String jenis) {
        if (jenis.equalsIgnoreCase("motor") || jenis.equalsIgnoreCase("mobil")) {
            this.jenis = jenis;
        } else {
            throw new IllegalArgumentException("Jenis kendaraan harus 'motor' atau 'mobil'");
        }
    }

    // Method untuk menampilkan data kendaraan
    public void printKendaraan() {
        System.out.println("Nomor Plat: " + noPlat);
        System.out.println("Jenis Kendaraan: " + jenis);
    }

    // Main method untuk menjalankan program
    public static void main(String[] args) {
        // Membuat objek kendaraan
        Kendaraan kendaraan1 = new Kendaraan("B 1234 ABC", "mobil");
        Kendaraan kendaraan2 = new Kendaraan("D 5678 XYZ", "motor");

        // Menampilkan data kendaraan
        kendaraan1.printKendaraan();
        System.out.println();
        kendaraan2.printKendaraan();
    }
}