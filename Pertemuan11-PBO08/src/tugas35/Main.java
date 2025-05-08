package tugas35;

public class Main {
    public static void main(String[] args) {
        Koleksi<Character> koleksiChar = new Koleksi<>();

        // Tambahkan 10 karakter (misal: A–J)
        for (char c = 'A'; c <= 'J'; c++) {
            koleksiChar.add(c);
        }

        System.out.println("Isi Koleksi:");
        koleksiChar.showAll();

        // Update karakter di index 5
        koleksiChar.setIsi(5, 'Z');

        // Hapus karakter di index 2
        koleksiChar.delete(2);

        System.out.println("\nSetelah di-update dan dihapus:");
        koleksiChar.showAll();
    }
}