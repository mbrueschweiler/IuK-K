public class Fibonacci {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c=0;
        int n=0;
        //System.out.println("Stufe 0: 0");
        while(n<=50) {
            c = a+b;
            System.out.println("Stufe "+n+":"+" "+a);
            a=b;
            b=c;
            n++;
        }
    }
}
