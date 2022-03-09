public class Schmuck extends Gegenstand {
    private String bezeichnung ;

    public Schmuck (int id , double wert , String bezeichnung) {
        super(id,wert);
        this.bezeichnung = bezeichnung ;
    }
    public String getBezeichnung() {
        return bezeichnung;
    }
    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    @Override
    public String toString() {
        String text = "ID  :" + getId();
               text+= "\n\t" + "Wert :" + getWert() ;
               text+= "\n\t" + "Bezeichnung :" + getBezeichnung();
               return text ;
    }
}
