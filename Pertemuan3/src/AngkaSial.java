public /**
* File      : AngkaSial.java
* Deskripsi : Program penggunaan exception buatan sendiri
*             Pengenalan klausa 'throw' dan 'throws'
*/

public class AngkaSial {

   public void cobaAngka(int angka) throws AngkaSialException {
       if (angka == 13) {
           throw new AngkaSialException();
       }
       System.out.println(angka + " bukan angka sial");
   }

   public static void main(String[] args) {
       AngkaSial as = new AngkaSial();
       try {
           as.cobaAngka(10);
           as.cobaAngka(13);
           as.cobaAngka(12);
       } catch (AngkaSialException ase) {
           // method getMessage() telah ada pada kelas "Exception"
           System.out.println(ase.getMessage());
           System.out.println("Hati-hati memasukkan angka!!!");
       }
   }
} 
////Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java di atas dieksekusi?
/*Jawaban: Tidak. Jika eksepsi terjadi sebelum baris ini dieksekusi, 
program akan langsung lompat ke blok catch tanpa menjalankan baris tersebut. */

//Apakah baris 21 pada AngkaSial.java di atas dieksekusi?
/*Jawaban: Ya. Baris ini berada dalam blok catch, sehingga akan dieksekusi jika terjadi eksepsi AngkaSialException.*/
