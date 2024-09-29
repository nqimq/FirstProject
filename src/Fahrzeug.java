public class Fahrzeug {

    //Attribute
    private int kmh;
    private String firma, modell;
    private String fahrer;
    private String beifahrer;

    //Referenzen

    // Konstruktor
    public Fahrzeug(int k,String f,String fa,String b) {
        kmh= k;
        firma = f;
        fahrer=fa;
        beifahrer=b;
        datenAnzeigen();
        nenneBesatzung();
    }

    //Methoden
    public void datenAnzeigen() {
        System.out.println("Dieses Auto ist von der Firma " + firma + " und fährt bis zu " + kmh + " Kilometer pro Stunde");
    }
    public void setFirma(String neueFirma) {
    this.firma = neueFirma;
    }
    public String getFirma() {
        return this.firma;
    }
    public void setKmh(int neueKmh) {
        this.kmh = neueKmh;
    }
    public int getKmh() {
        return this.kmh;
    }
    public void setFahrer(String neuerFahrer) {
        this.fahrer = neuerFahrer;
    }
    public String getFahrer() {
        return this.fahrer;
    }
    public void setBeifahrer(String neuerBeifahrer) {
        this.beifahrer = neuerBeifahrer;
    }
    public String getBeifahrer() {
        return this.beifahrer;
    }
    public void nenneBesatzung(){
        System.out.println("In diesem Auto sitzen " + getFahrer() + " und " + getBeifahrer());
    }
}