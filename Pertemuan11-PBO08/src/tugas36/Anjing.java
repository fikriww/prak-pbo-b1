package tugas36;

public class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    public void bunyi() {
        System.out.println(nama + ": Guk-guk!");
    }

    public void gerak() {
        System.out.println(nama + " melata.");
    }
}