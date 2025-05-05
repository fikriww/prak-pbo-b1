/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnabulApp;

/**
 *
 * @author driven
 */
public class ContohMetodeGenerik {
    public static <T extends Anabul> void tampilkanPerilaku(Datum<T> datum) {
        T anabul = datum.getIsi();
        anabul.gerak();
        anabul.bersuara();
        System.out.println();
    }
}
