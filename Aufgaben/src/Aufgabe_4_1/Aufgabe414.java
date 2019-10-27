package Aufgabe_4_1;

public class Aufgabe414 {
    public static void main(String[] args) {
        int x =24;
        int y =9;
        if (x==y) {
            System.out.println("x und y sind gleich gross");
        }
        else {
        while(x!=y) {
            if (x > y) {
                x = x - y;
               System.out.println("x = "+x);
            } else {
                y = y - x;
                System.out.println("y = "+y);
            }
        }
        System.out.println("Der ggT von x und y ist: "+ x);
        }
    }
}
