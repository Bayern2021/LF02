public class Kaufvertrag {
    private Vertragspartner verkaeufer ;
    private Vertragspartner kaeufer ;
    private Ware ware ;
    private String zahlungsModalitaeten ;

    public Kaufvertrag(Vertragspartner verkaeufer , Vertragspartner kaeufer , Ware ware ){
        this.verkaeufer = verkaeufer ;
        this.kaeufer = kaeufer ;
        this.ware = ware ;

    }

    public Vertragspartner getVerkaeufer() {
        return verkaeufer;
    }

    public Vertragspartner getKaeufer() {
        return kaeufer;
    }

    public void setKaeufer(Vertragspartner kaeufer) {
        this.kaeufer = kaeufer;
    }

    public Ware getWare() {
        return ware;
    }

    public void setWare(Ware ware) {
        this.ware = ware;
    }

    public String getZahlungsModalitaeten() {
        return zahlungsModalitaeten;
    }

    public void setZahlungsModalitaeten(String zahlungsModalitaeten) {
        this.zahlungsModalitaeten = zahlungsModalitaeten;
    }

    @Override
    public String toString() {
        String text = "Verkäufer :" + getVerkaeufer();
               text+= "\n\t" + "Käufer :" + getKaeufer();
               text+= "\n\t" + "Ware :" + getWare();
               text+= "\n\t" + "Zahlungsmodalitäten :" + getZahlungsModalitaeten();
               return text ;

    }
}
