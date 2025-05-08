package tugas36;

public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    public void bunyi() {
        System.out.println(nama + ": Meong!");
    }

    public void gerak() {
        System.out.println(nama + " melata.");
    }
}