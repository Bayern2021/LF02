package schritt1;

public class Spiel {
    private Mannschaft heim;
    private Mannschaft gast;
    private Ergebnis ergebnis;
    private StringBuilder spielbericht;

    public Spiel(Mannschaft heim,Mannschaft gast,Ergebnis ergebnis){
        this.heim = heim;
        this.gast = gast;
        this.ergebnis = ergebnis;

    }

    public Mannschaft getHeim() {
        return heim;
    }

    public Mannschaft getGast() {
        return gast;
    }

    public Ergebnis getErgebnis() {
        return ergebnis;
    }

    public StringBuilder getSpielbericht() {
        return spielbericht;
    }
    @Override
    public String toString(){
         String text =  "\n\t" + "Ergebnis:"+ getErgebnis();
        text += "\n\t" + "Spielverlauf"+ getSpielbericht();
        return text ;
    }
}
