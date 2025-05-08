package tugas35;

import java.util.ArrayList;

public class Koleksi<T> {
    private int nbelm;
    private ArrayList<T> wadah;

    public Koleksi() {
        wadah = new ArrayList<>();
        nbelm = 0;
    }

    public T getIsi(int index) {
        return wadah.get(index);
    }

    public void setIsi(int index, T elemen) {
        wadah.set(index, elemen);
    }

    public int getSize() {
        return nbelm;
    }

    public void setSize(int n) {
        this.nbelm = n;
        // pastikan ukuran wadah sinkron
        while (wadah.size() < n) {
            wadah.add(null);
        }
        while (wadah.size() > n) {
            wadah.remove(wadah.size() - 1);
        }
    }

    public void add(T elemen) {
        wadah.add(elemen);
        nbelm++;
    }

    public void delete(int index) {
        if (index >= 0 && index < wadah.size()) {
            wadah.remove(index);
            nbelm--;
        }
    }

    public void showAll() {
        for (int i = 0; i < wadah.size(); i++) {
            System.out.println("Index " + i + ": " + wadah.get(i));
        }
    }
}