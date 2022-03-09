public class Sparkonto extends Konto{

    public Sparkonto(Kunde inhaber , double zinsGuthaben){
        super(inhaber,0,0,zinsGuthaben);
    }

    @Override
    public String toString() {
        String text = "Inhaber :" + getInhaber();
               text+= "\n\tKontostand :" + getKontoStand();
               text+= "\n\tKreditlimit :" + getKreditLimit();
               text+= "\n\tZinsguthaben :" + getZinsGuthaben();
               return text ;

    }
}
