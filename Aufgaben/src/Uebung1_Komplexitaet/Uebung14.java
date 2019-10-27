package Uebung1_Komplexitaet;

public class Uebung14 {
    public static void main(String[] args) {
    int n = 65536000;
    int i;
    int sum = 0;
    long start = System.currentTimeMillis();
    for (i=0; n>i; i++) {
        sum++;
    }
    long stop = System.currentTimeMillis();
    long zeit = stop - start;
    System.out.println(zeit);
    System.out.println(sum);
    }
}
