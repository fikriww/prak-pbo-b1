/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AnabulApp;

/**
 *
 * @author driven
 */
public class Main {
    public static void main(String[] args) {
        Datum<Kucing> datumKucing = new Datum<>(new Kucing("Kitty"));
        Datum<Anjing> datumAnjing = new Datum<>(new Anjing("Doggo"));
        Datum<Burung> datumBurung = new Datum<>(new Burung("Tweety"));

        ContohMetodeGenerik.tampilkanPerilaku(datumKucing);
        ContohMetodeGenerik.tampilkanPerilaku(datumAnjing);
        ContohMetodeGenerik.tampilkanPerilaku(datumBurung);
    }
}
