/**
 * File      : Asersi2.java
 * Deskripsi : Program untuk demo asersi, yang akan menolak input 
 *             jari-jari lingkaran yang bernilai nol
 */

// class Lingkaran
class Lingkaran {
    private double jariJari;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    public double hitungKeliling() {
        double keliling = 2 * Math.PI * jariJari;
        return keliling;
    }
}

// class Asersi2
public class Asersi2 {
    public static void main(String[] args) {
        double jariJari = 0;
        assert (jariJari > 0) : "jari-jari tidak boleh nol!!!";

        Lingkaran l = new Lingkaran(jariJari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("keliling lingkaran = " + kelilingLingkaran);
    }
}
//secara konsep, ada yang kurang tepat pada program Asersi2 di atas.

/*Jawaban: Program Asersi2 memiliki kesalahan dalam penggunaan assertion. 
Assertion digunakan untuk memastikan kondisi yang seharusnya tidak terjadi dalam program, bukan untuk validasi input pengguna. 
Dalam kode ini, jariJari diinisialisasi dengan 0, sehingga assertion selalu gagal jika diaktifkan. */