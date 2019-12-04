package Kapitel_2;

public class Aufgabe5 {

	static int fib(int n) {
		if (n == 0 || n == 1) {
			return 1;
		} else {
			return fib(n-1)+fib(n-2);
		}
	}
	
	public static void main(String[] args) {
		int n = 8;
		System.out.println("fib("+n+")="+fib(n));
	}
}
