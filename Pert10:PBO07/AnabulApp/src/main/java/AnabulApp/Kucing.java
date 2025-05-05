/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnabulApp;

/**
 *
 * @author driven
 */

public class Kucing extends Anabul {
    public Kucing(String nama) {
        super(nama);
    }

    public void gerak() {
        System.out.println(nama + " bergerak melata.");
    }

    public void bersuara() {
        System.out.println(nama + " bersuara: Meong!");
    }
}
