public class Fahrzeug {

    //Attribute

    //Referenzen
    private Person fahrer, beifahrer;

    // Konstruktor
    public Fahrzeug() {
    }

    //Methoden

    public void setFahrer(Person neuerFahrer) {
        this.fahrer = neuerFahrer;
    }
    public Person getFahrer() {
        return this.fahrer;
    }
    public void setBeifahrer(Person neuerBeifahrer) {
        this.beifahrer = neuerBeifahrer;
    }
    public Person getBeifahrer() {
        return this.beifahrer;
    }
    public void nenneBesatzung(){
        System.out.println("In diesem Auto sitzen " + fahrer.getName() + " und " + beifahrer.getName());
    }
}