public class Titik {
    /* States/Atribut */
    double absis;
    double ordinat;

    /* Behavior/Method */

    // Konstruktor
    Titik() {
        absis = 0;
        ordinat = 0;
    }

    // Konstruktor dengan parameter
    Titik(double x, double y) {
        absis = x;
        ordinat = y;
    }
    
    // Mengembalikan nilai absis
    double getAbsis() {
        return absis;
    }

    // Mengembalikan nilai ordinat
    double getOrdinat() {
        return ordinat;
    }

    // Mengubah nilai absis
    void setAbsis(double x) {
        this.absis = x;
    }

    // Mengubah nilai ordinat
    void setOrdinat(double y) {
        this.ordinat = y;
    }

    // Menggeser nilai absis dan ordinat masing-masing sejauh x dan y
    void geser(double x, double y) {
        absis += x;
        ordinat += y;
    }

    // Mengembalikan nilai kuadran
    void getKuadran() {
        if (absis > 0 && ordinat > 0) {
            System.out.println("Titik berada di kuadran I");
        } else if (absis < 0 && ordinat > 0) {
            System.out.println("Titik berada di kuadran II");
        } else if (absis < 0 && ordinat < 0) {
            System.out.println("Titik berada di kuadran III");
        } else if (absis > 0 && ordinat < 0) {
            System.out.println("Titik berada di kuadran IV");
        } else {
            System.out.println("Titik berada di titik pusat");
        }
    }

    // Mengembalikan jarak titik ke titik pusat
    void getJarakKePusat() {
        double jarak = Math.sqrt(Math.pow(getAbsis(), 2) + Math.pow(getOrdinat(), 2));
        System.out.println("Jarak titik ke titik pusat: " + jarak);
    }

    // Mengembalikan jarak titik ke titik lain
    void getJarakKeTitik(Titik T) {
        double jarak = Math.sqrt(Math.pow(getAbsis() - T.getAbsis(), 2) + Math.pow(getOrdinat() - T.getOrdinat(), 2));
        System.out.println("Jarak titik ke titik lain: " + jarak);
    }

    // Refleksi terhadap sumbu x
    void refleksiSumbuX() {
        ordinat *= -1;
    }

    // Refleksi terhadap sumbu y
    void refleksiSumbuY() {
        absis *= -1;
    }

    // Mengembalikan refleksi X
    void getRefleksiX() {
        System.out.println("Refleksi terhadap sumbu X: (" + absis + ", " + (-ordinat) + ")");
    }

    // Mengembalikan refleksi Y
    void getRefleksiY() {
        System.out.println("Refleksi terhadap sumbu Y: (" + (-absis) + ", " + ordinat + ")");
    }

    // Mencetak koordinat titik
    void printTitik() {
        System.out.println("Titik (" + absis + ", " + ordinat + ")");
    }
}