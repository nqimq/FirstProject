public class MainControl {

    // Attribute

    //Referenzen
    private Person person1;
    private Person person2,person3;

    public static void main(String[] args) {
        new MainControl();
    }
    public MainControl() {
       person1 = new Person("Olaf",17);
       person2 = new Person("Johanna",19);

       person1.halloSagen();
       System.out.println(person1);
       System.out.println(person3);
    }
}


