package tugas34;

public class Main {
    public static void main(String[] args) {
        Persegi p = new Persegi(5);
        PersegiPanjang pp = new PersegiPanjang(4, 7);
        Segitiga s = new Segitiga(6, 4);

        BangunDatarGenerik<Persegi> bdPersegi = new BangunDatarGenerik<>(p);
        BangunDatarGenerik<PersegiPanjang> bdPP = new BangunDatarGenerik<>(pp);
        BangunDatarGenerik<Segitiga> bdSegitiga = new BangunDatarGenerik<>(s);

        System.out.println("=== Persegi ===");
        bdPersegi.tampilkanInfo();

        System.out.println("\n=== Persegi Panjang ===");
        bdPP.tampilkanInfo();

        System.out.println("\n=== Segitiga ===");
        bdSegitiga.tampilkanInfo();
    }
}
