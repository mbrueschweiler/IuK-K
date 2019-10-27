package JavaNuggets4;

public class Beispiel1 {

    public static void main(String[] args) {

        int i = 1;
        increment(i);
        System.out.println(i);

        Integer i2 = 1;
        increment(i2);
        System.out.println(i2);
    }

    public static void increment(int i) {
        i++;
    }

    public static void increment(Integer i) {
        i++;
    }

}
