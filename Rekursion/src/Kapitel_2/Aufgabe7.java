package Kapitel_2;

public class Aufgabe7 {

	private static int mpx = 0;
	private static int mpy = 0;


	           static void strecke(Dialog dialog, int x1, int y1, int x2, int y2) {
	                     if((x2 - x1)<=1 && (y2 - y1)<=1){
	                                dialog.markiere(x1, y1);
	                                dialog.markiere(x2, y2);
	                     }
	                     else{
	                                mpx = ((x2 + x1) /2);
	                                mpy = ((y2 + y1) /2);
	                                
	                                strecke(dialog, x1, y1, mpx, mpy);
	                                strecke(dialog, mpx, mpy, x2, y2);
	                                
	                     }
	           }
	           

	
//	static void strecke(Dialog dialog, int x1, int y1, int x2, int y2) {
//		if (Math.abs(x1-x2)<= 1 && Math.abs(y1-y2)<= 1) {
//			dialog.markiere(x1,y1);
//			dialog.markiere(x1,y1);
//		} else {
//			int x = (x1 + x2) / 2;
//			int y = (y1 + y2) / 2;
//			strecke(dialog, x1, y1, x, y);
//			strecke(dialog, x, y, x2, y2);
//		}
//	}

	public static void main(String[] args) {
		Dialog dialog = new Dialog();
				
		// Zeichne eine Linie von (10,10) nach (100,100)
		strecke (dialog, 10, 10, 100, 100);
	}

}
