package Aufgabe_4_3;

public class Schuh {
    private int groesse;
    private String hersteller;
    private String modellbezeichnung;

    public void setGroesse(int g) {
        groesse = g;
    }

    public void setHersteller(String h) {
        hersteller = h;
    }

    public void setModellbezeichnung(String m) {
        modellbezeichnung = m;
    }

    public int getGroesse() {
        return groesse;
    }

    public String getHersteller() {
        return hersteller;
    }

    public String getModellbezeichnung() {
        return modellbezeichnung;
    }

    //public String print() {
        //return "Grösse: " + groesse;
        //return hersteller;
        //return "Modellbezeichnung" + modellbezeichnung;
        //System.out.println("Grösse: " + groesse);
        //System.out.println("Hersteller: " + hersteller);
        //System.out.println("Modellbezeichnung" + modellbezeichnung);
    //}
}
