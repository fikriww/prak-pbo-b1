package tugas36;

import java.util.ArrayList;

public class Koleksi<T> {
    private int nbelm;
    private ArrayList<T> wadah;

    public Koleksi() {
        wadah = new ArrayList<>();
        nbelm = 0;
    }

    public void add(T elemen) {
        wadah.add(elemen);
        nbelm++;
    }

    public void showAll() {
        for (T elemen : wadah) {
            if (elemen instanceof Anabul) {
                Anabul a = (Anabul) elemen;
                System.out.println("Nama: " + a.getNama());
                a.bunyi();
                a.gerak();
                System.out.println();
            }
        }
    }
}