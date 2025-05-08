package tugas34;

public class BangunDatarGenerik<T extends BangunDatar> {
    private T bangunDatar;

    public BangunDatarGenerik(T bangunDatar) {
        this.bangunDatar = bangunDatar;
    }

    public double hitungLuas() {
        return bangunDatar.getLuas();
    }

    public double hitungKeliling() {
        return bangunDatar.getKeliling();
    }

    public void tampilkanInfo() {
        System.out.println("Luas: " + hitungLuas());
        System.out.println("Keliling: " + hitungKeliling());
    }
}
