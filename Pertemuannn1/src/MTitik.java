public class MTitik {
    public static void main(String[] args) {
        System.out.println("==========Membuat Objek Titik==========");
        // Membuat titik T1
        System.out.println("Titik T1:");
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(4);
        T1.printTitik();
        T1.geser(3, 4);
        T1.printTitik();
        T1.getKuadran();
        T1.getJarakKePusat();
        T1.getJarakKeTitik(T1);
        T1.refleksiSumbuX();    
        T1.refleksiSumbuY();
        T1.getRefleksiX();
        T1.getRefleksiY();
        T1.printTitik();
    }
}