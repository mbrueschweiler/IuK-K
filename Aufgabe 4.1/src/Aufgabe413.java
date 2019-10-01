public class Aufgabe413 {
    public static void main(String[] args) {
        int a=0;
        int b=1;
        int c=0;
        int n=1;
        System.out.println("Stufe 0: 0");
        while(n<=10) {
            c = a+b;
            a=b;
            b=c;
            System.out.println("Stufe "+n+":"+" "+a);
            n++;
        }
    }
}
