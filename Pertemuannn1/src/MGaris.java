public class MGaris {
    public static void main(String[] args) {
        System.out.println("========== Membuat Objek Garis ==========");

        // Membuat titik awal dan titik akhir
        Titik A = new Titik();
        A.setAbsis(-2);
        A.setOrdinat(0);

        Titik B = new Titik();
        B.setAbsis(0);
        B.setOrdinat(4);

        // Membuat objek garis G1
        Garis G1 = new Garis(A, B);
        System.out.println("\n== Garis G1 ==");
        G1.printGaris();
        System.out.println("Panjang garis: " + G1.getPanjang());
        System.out.println("Gradien garis: " + G1.getGradien());
        System.out.println("Titik tengah garis: (" + G1.getTitikTengah().getAbsis() + ", " + G1.getTitikTengah().getOrdinat() + ")");
        System.out.println("Persamaan garis: " + G1.getPersamaanGaris());

        // Membuat garis lain untuk pengujian sejajar dan tegak lurus
        Titik C = new Titik();
        C.setAbsis(1);
        C.setOrdinat(6);

        Titik D = new Titik();
        D.setAbsis(3);
        D.setOrdinat(10);

        Garis G2 = new Garis(C, D);
        System.out.println("\n== Garis G2 ==");
        G2.printGaris();
        System.out.println("G1 sejajar dengan G2? " + G1.isSejajar(G2));
        System.out.println("G1 tegak lurus dengan G2? " + G1.isTegakLurus(G2));

        // Menampilkan jumlah objek Garis yang telah dibuat
        System.out.println("\nJumlah objek Garis yang dibuat: " + Garis.getCounterGaris());
    }
}