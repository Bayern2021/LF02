package schritt1;

public class Spiel {
    private Mannschaft heim;
    private Mannschaft gast;
    private Ergebnis ergebnis;
    private StringBuilder spielbericht;

    public Spiel(Mannschaft heim,Mannschaft gast,Ergebnis ergebnis){
        this.heim = heim;
        this.gast = gast;
        ergebnis = new Ergebnis();
        spielbericht = new StringBuilder();

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
         String text = "Spiel zwischen "+ heim.getName()+gast.getName();
        text = text + spielbericht;
        return text ;
    }
}
