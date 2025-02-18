public class Garis {
    private Titik titikAwal;
    private Titik titikAkhir;
    private static int counterGaris = 0;

    // Konstruktor tanpa parameter
    public Garis() {
        this.titikAwal = new Titik();
        this.titikAkhir = new Titik();
        this.titikAkhir.setAbsis(1);
        this.titikAkhir.setOrdinat(1);
        counterGaris++;
    }

    // Konstruktor dengan parameter
    public Garis(Titik awal, Titik akhir) {
        this.titikAwal = awal;
        this.titikAkhir = akhir;
        counterGaris++;
    }

    // Getter dan Setter
    public Titik getTitikAwal() {
        return titikAwal;
    }

    public Titik getTitikAkhir() {
        return titikAkhir;
    }

    public void setTitikAwal(Titik awal) {
        this.titikAwal = awal;
    }

    public void setTitikAkhir(Titik akhir) {
        this.titikAkhir = akhir;
    }

    public static int getCounterGaris() {
        return counterGaris;
    }

    // Menghitung panjang garis
    public double getPanjang() {
        return Math.sqrt(Math.pow(titikAkhir.getAbsis() - titikAwal.getAbsis(), 2) + 
                         Math.pow(titikAkhir.getOrdinat() - titikAwal.getOrdinat(), 2));
    }

    // Menghitung gradien garis
    public double getGradien() {
        double deltaX = titikAkhir.getAbsis() - titikAwal.getAbsis();
        double deltaY = titikAkhir.getOrdinat() - titikAwal.getOrdinat();
        if (deltaX == 0) {
            throw new ArithmeticException("Gradien tidak terdefinisi (garis vertikal)");
        }
        return deltaY / deltaX;
    }

    // Mendapatkan titik tengah garis
    public Titik getTitikTengah() {
        double midX = (titikAwal.getAbsis() + titikAkhir.getAbsis()) / 2;
        double midY = (titikAwal.getOrdinat() + titikAkhir.getOrdinat()) / 2;
        return new Titik(midX, midY);
    }

    // Mengecek apakah sejajar dengan garis lain
    public boolean isSejajar(Garis g) {
        try {
            return this.getGradien() == g.getGradien();
        } catch (ArithmeticException e) {
            return false; // Mengatasi kasus garis vertikal yang gradiennya tidak terdefinisi
        }
    }

    // Mengecek apakah tegak lurus dengan garis lain
    public boolean isTegakLurus(Garis g) {
        try {
            return this.getGradien() * g.getGradien() == -1;
        } catch (ArithmeticException e) {
            return false; // Mengatasi kasus gradien tidak terdefinisi
        }
    }

    // Menampilkan titik awal dan titik akhir garis
    public void printGaris() {
        System.out.println("Garis dari " + titikAwal.getAbsis() + "," + titikAwal.getOrdinat() + 
                           " ke " + titikAkhir.getAbsis() + "," + titikAkhir.getOrdinat());
    }

    // Menampilkan persamaan garis dalam bentuk y = mx + c
    public String getPersamaanGaris() {
        double m = getGradien();
        double c = titikAwal.getOrdinat() - m * titikAwal.getAbsis();
        return "y = " + m + "x + " + c;
    }
}