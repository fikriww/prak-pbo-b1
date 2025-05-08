package tugas36;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Koleksi<Anabul> koleksiAnabul = new Koleksi<>();
        Random rand = new Random();

        for (int i = 1; i <= 10; i++) {
            int jenis = rand.nextInt(3);
            String nama = "Anabul" + i;

            switch (jenis) {
                case 0:
                    koleksiAnabul.add(new Kucing(nama));
                    break;
                case 1:
                    koleksiAnabul.add(new Anjing(nama));
                    break;
                case 2:
                    koleksiAnabul.add(new Burung(nama));
                    break;
            }
        }

        System.out.println("=== Koleksi Anabul ===");
        koleksiAnabul.showAll();
    }
}