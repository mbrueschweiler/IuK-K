package Test_2;

public class Test {
	static int Pascal(int zeile, int position) {
		if (zeile < 0) {
			throw new IllegalArgumentException("i must be greater or equal 0");
		}
		if (position < 0){
			throw new IllegalArgumentException("j must be greater or equal 0");
		}
		if (zeile < position) {
			throw new IllegalArgumentException("i must be greater or equal j");
		}
		return P(zeile,position);
	}
	
	static int P(int zeile, int position) {
//		System.out.println("Berechne Wert an der Stelle " + i + ", " + j);
		if (position == 0) {
			return 1;
		} else if (zeile == position){
			return 1;
		} else {
			int links = P(zeile-1,position-1);
			int rechts = P(zeile-1,position);
			return links + rechts;
		}
	}
	
	public static void main(String[] args) {
		int zeile = 4;
		int spalte = 1
				;
		System.out.println("P(" + zeile +","+spalte+")=" + Pascal(zeile, spalte)); 
	}
}
