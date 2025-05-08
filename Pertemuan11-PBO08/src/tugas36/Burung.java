package tugas36;

public class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    public void bunyi() {
        System.out.println(nama + ": Cuit!");
    }

    public void gerak() {
        System.out.println(nama + " terbang.");
    }
}