package Uebung1_Komplexitaet;

public class Uebung142 {
    public static void main(String[] args) {
        int n = 1000000000;
        int i;
        int j;
        int sum = 0;
        long start = System.currentTimeMillis();
        for (i=0; i<n; i++) {
            for (j=0; j<n; j++) {
                sum++;
            }
        }
        long stop = System.currentTimeMillis();
        long zeit = stop - start;
        System.out.println(zeit);
    }
}
