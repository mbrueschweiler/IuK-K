package JavaNuggets4;

public class Beispiel2 {

    public static void main(String[] args) {

        Zahl z = new Zahl(1);
        increment(z);
        System.out.println(z.get());

    }
    public static void increment(Zahl z) {
        z.set(z.get()+1);
    }
}
