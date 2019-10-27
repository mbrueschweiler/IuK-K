package Aufgabe_4_3;

public class TestSchuh {
    public static void main(String[] args) {
        int groesse;
        String hersteller;
        String modellbezeichnung;
        Schuh s;

        s = new Schuh();

        s.setGroesse(42);
        s.setHersteller("Mike");
        s.setModellbezeichnung("Air Ultramatic");

        groesse = s.getGroesse();
        hersteller = s.getHersteller();
        modellbezeichnung = s.getModellbezeichnung();

        //System.out.println(s.print());

        System.out.println("Grösse: " + groesse);
        System.out.println("Hersteller: " + hersteller);
        System.out.println("Modellbezeichnung" + modellbezeichnung);
    }
}
