public class MainControl {

    // Attribute

    //Referenzen
    private Person person1, person2;
    private Fahrzeug fahrzeug1;


    public static void main(String[] args) {
        new MainControl();
    }

    public MainControl() {
        person1 = new Person("Jasmin", 18);
        person2 = new Person("Johanna", 19);
        fahrzeug1 = new Fahrzeug();
        fahrzeug1.setBeifahrer(person1);
        fahrzeug1.setFahrer(person2);
        fahrzeug1.nenneBesatzung();
    }
}


