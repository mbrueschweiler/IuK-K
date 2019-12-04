package Kapitel_2;

public class GgT {
    private static int ggt(int zahl1, int zahl2) {
        if(zahl1==zahl2) {
            return zahl1;
        } else {
            while ((zahl2 != 0) && (zahl1 != zahl2)) {
                if (zahl1 > zahl2) {
                    zahl1 = zahl1-zahl2;
                } else {
                    zahl2 = zahl2-zahl1;
                }
            }
            return zahl1;
        }
    }
    public static void main(String[] args) {
        int ersteZahl = 7;
        int zweiteZahl = 7;

        int ergebnis = ggt(ersteZahl, zweiteZahl);
        System.out.println("ggt("+ersteZahl+", "+zweiteZahl+")="+ergebnis);
    }
}
