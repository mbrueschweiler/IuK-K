public class MathTest2 {

    public static void main(String[] args) {
        boolean result = true;
        if (10 != Math.max(10, 3)) {
            result = false;
        }
        if (200 != Math.max(35, 200)) {
            result = false;
        }
        System.out.println(result);
    }
}
