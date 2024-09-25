public class Fahrzeug {

    //Attribute
    private int kmh;
    private String firma;

    //Referenzen

    // Konstruktor
    public Fahrzeug(int k,String f) {
        kmh= k;
        firma = f;
        datenAnzeigen(kmh,firma);
    }

    //Methoden
    public void datenAnzeigen(int kmh, String firma) {
        System.out.println("Dieses Auto ist von der Firma " + firma + " und fährt bis zu " + kmh + " Kilometer pro Stunde");
    }
}