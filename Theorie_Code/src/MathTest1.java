public class MathTest1 {

    public static void main(String[] args) {
        System.out.println("Test 1: max(10, 3) - first argument greater than second");
        System.out.println(" Expected: " + 10);
        System.out.println(" Actual: " + Math.max(10, 3));

        System.out.println("Test 2: max(35, 200) - first argument smaller than second");
        System.out.println(" Expected: " + 200);
        System.out.println(" Actual: " + Math.max(35, 200));
    }

}
