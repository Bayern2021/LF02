import java.util.ArrayList;
import java.util.List;

public class Ware {
    private String bezeichnung ;
    private String beschreibung ;
    private double preis ;
    private List<String> besonderheiten ;
    private List<String> maengel ;

    public Ware(String bezeichnung ,double preis){
        this.bezeichnung = bezeichnung ;
        this.preis = preis ;
        this.besonderheiten = new ArrayList<String>();
        this.maengel = new ArrayList<String>();
    }

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    public void setBeschreibung(String beschreibung) {
        this.beschreibung = beschreibung;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public List<String> getBesonderheiten() {
        return besonderheiten;
    }

    public List<String> getMaengel() {
        return maengel;
    }

    @Override
    public String toString() {
         String text = "Bezeichnung :" + getBezeichnung();
                text+= "\n\t" + "Beschreibung :" + getBeschreibung();
                text+= "\n\t" + "Preis :" + getPreis();
                text+= "\n\t" + "Besonderheiten :" + getBesonderheiten();
                text+= "\n\t" + "Mängel :" + getMaengel();
                return text ;
    }
}
