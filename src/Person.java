public class Person {

    //Attribute
    private String name;
    private int alter;

    //Referenzen

    // Konstruktor
    public Person(String n, int a){
       name = n;
       alter = a;
       halloSagen();
    }

    //Methoden
    public void halloSagen(){
        System.out.println("Hi, my name is "+name+" and I`m "+alter +" years old");
    }
}
