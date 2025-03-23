/* Nama File : Pajak.java
 * Deskripsi : Interface Pajak
 * Pembuat : Cipta Fikri Wiratama - 24060123140172 
 * Tanggal : Minggu, 23 Maret 2025
 */

import java.text.NumberFormat;
import java.util.Locale;

public interface Pajak {
    default String formatRupiah(double amount) {
        NumberFormat formatRupiah = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        return formatRupiah.format(amount);
    }
    String hitungPajak();
}
