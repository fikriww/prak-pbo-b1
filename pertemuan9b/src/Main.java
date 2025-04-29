// Kelas induk
abstract class Anabul {
    protected String nama;

    public Anabul(String nama) {
        this.nama = nama;
    }

    public abstract void gerak();
    public abstract void bersuara();
}

// Kelas anak: Kucing
class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Meong!");
    }
}

// Kelas anak: Anjing
class Anjing extends Anabul {
    public Anjing(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan melata.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Guk-guk!");
    }
}

// Kelas anak: Burung
class Burung extends Anabul {
    public Burung(String nama) {
        super(nama);
    }

    @Override
    public void gerak() {
        System.out.println(nama + " bergerak dengan terbang.");
    }

    @Override
    public void bersuara() {
        System.out.println(nama + " bersuara: Cuit!");
    }
}

// Program utama
public class Main {
    public static void main(String[] args) {
        Anabul kucing = new Kucing("Kiki");
        Anabul anjing = new Anjing("Bobby");
        Anabul burung = new Burung("Cici");

        kucing.gerak();
        kucing.bersuara();

        anjing.gerak();
        anjing.bersuara();

        burung.gerak();
        burung.bersuara();
    }
}