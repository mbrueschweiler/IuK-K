package Uebung1_Komplexitaet;

public class Uebung143 {
    public static void main(String[] args) {
        int n = 1000000000;
        int i;
        int j;
        int sum = 0;
        long start = System.currentTimeMillis();
        for (i=0; n>i; i++) {
            for (j=0; j<i; j++) {
                sum++;
            }
        }
        long stop = System.currentTimeMillis();
        long zeit = stop - start;
        System.out.println(zeit);
        System.out.println(sum);
    }
}
