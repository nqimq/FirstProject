public class MainControl {

    // Attribute

    //Referenzen
    private Person person1;
    private Person person2,person3;
    private Fahrzeug fahrzeug1;
    private Person fahrer,beifahrer;

    public static void main(String[] args) {
        new MainControl();
    }
    public MainControl() {
      // person1 = new Person("Olaf",17);
       person2 = new Person("Johanna",19);
       fahrzeug1 = new Fahrzeug(100,"Mercedes","fahrer", "beifahrer");
        fahrzeug1.setFahrer("Mia");
        fahrzeug1.setBeifahrer("Leon");


        //fahrzeug1.datenAnzeigen();
        // fahrzeug1.setFirma("Bmw");
        //  fahrzeug1.setKmh(120);
        //   System.out.println("Nein, dieses Auto ist von der Firma " + fahrzeug1.getFirma() + " und fährt bis zu " + fahrzeug1.getKmh() + " Kilometer pro Stunde");
        //System.out.println(person3);
        //System.out.println(fahrzeug1);
    }
}


