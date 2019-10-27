import java.math.BigDecimal;

public class JavaNuggets2 {
    public static void main(String[] args) {
        double d1= 0.1;
        double d2= 0.2;
        double d3= d1 + d2;
        boolean b1 = d3 == 0.3;
        BigDecimal bd3 = new BigDecimal(d3);
        //System.out.println(d1);
        //System.out.println(d2);
        System.out.println("d3 = "+d3);
        System.out.println("Die Rechnung ist "+b1);
        System.out.println(bd3);

        float f1 = 16777216.0f;
        float f2 = f1 + 1.0f;
        float f3 = f1 + 2.0f;
        float f4 = f2 + 1.0f;
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);
        System.out.println(f4);
    }
}
