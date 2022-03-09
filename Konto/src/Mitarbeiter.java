public class Mitarbeiter  extends  Person{


    public Mitarbeiter(String vorname,String nachname){
        super(vorname ,nachname);

    }

    @Override
    public String toString() {
        String text = "Vorname :"+ getVorname() ;
               text+= "\nNachname :" + getNachname() ;
               return text ;
    }
}
