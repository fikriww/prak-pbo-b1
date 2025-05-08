package tugas34;

public class Segitiga implements BangunDatar {
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
    }

    public double getLuas() {
        return 0.5 * alas * tinggi;
    }

    public double getKeliling() {
        // Asumsi segitiga sama kaki
        double sisiMiring = Math.sqrt(Math.pow((alas / 2), 2) + Math.pow(tinggi, 2));
        return alas + 2 * sisiMiring;
    }
}
