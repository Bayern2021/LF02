import java.util.ArrayList;

public class Tresor {
    private ArrayList<Gegenstand> gegenstaendeliste ;

    public Tresor() {
        gegenstaendeliste = new ArrayList<Gegenstand>() ;

    }
    public Gegenstand getGegenstand(int id) throws GegenstandNichtGefundenException {
        for (Gegenstand g : gegenstaendeliste){
            if (g.getId() == id){
                return g ;

            }
        }
        throw new GegenstandNichtGefundenException(id);
    }
    public void addGegenstand(Gegenstand gegenstand) {
        gegenstaendeliste.add(gegenstand);
    }
    public void removeGegenstand(Gegenstand gegenstand) {
        gegenstaendeliste.remove(gegenstand);
    }
    public double berechneGesamtwert(){
        double gesamtwert = 0 ;
        for (Gegenstand g : gegenstaendeliste) {
            g.getWert() ;
            gesamtwert+= g.getWert();

        }
        return gesamtwert;


    }

    @Override
    public String toString() {
      String text = "\n Liste der Gegenstände :" ;
        for (Gegenstand g:gegenstaendeliste){
             text+= "\n" + g.toString();

        }
             text+= "\n Gesamtwert :" + berechneGesamtwert();
             return text ;

        }
    }

