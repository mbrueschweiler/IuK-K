package Kapitel_1;

public class Chaos {

    public static void main(String[] args) {
        double a= 0.2;
        int k = 2;
        int n = 100;
        int i;
        for (i = 1; i < n; i++) {
            a = k * a * (1 - a);
System.out.println("Schritt " + i + ": " + a);
        }
    }
}
