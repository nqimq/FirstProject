public class Person {

    //Attribute
    private String name;
    private int alter;


    //Referenzen

    // Konstruktor
    public Person(String n, int a){
       name = n;
       alter = a;
    }

    //Methoden

    public void setName(String neuerName) {
        this.name = neuerName;
    }
    public String getName() {
        return this.name;
    }
    public void setAlter(int neuesAlter) {
        this.alter = neuesAlter;
    }
    public int getAlter() {
        return this.alter;
    }
}
