public class JavaNuggets1 {
    public static void main(String[] args) {
        byte a = 127;
        byte b = -128;
        //byte c = -129;
        byte d = (byte) -129;
        //byte e = a + b;
        //byte f = 2 * a;
        byte g = (byte) (a + b);
        byte h = (byte) (2 * a);
        int i = 'a' + a;
        int j = a + a;
        //System.out.println(e);
        //System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
    }
}

