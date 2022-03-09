public abstract class Konto {
    private Kunde inhaber ;
    private double kontoStand ;
    private double kreditLimit ;
    private double zinsGuthaben ;

    public Konto(Kunde inhaber , double kontoStand , double kreditLimit , double zinsGuthaben){
        this.inhaber = inhaber ;
        this.kontoStand = kontoStand ;
        this.kreditLimit = kreditLimit ;
        this.zinsGuthaben = zinsGuthaben ;
    }

    public Kunde getInhaber() {
        return inhaber;
    }

    public double getKontoStand() {
        return kontoStand;
    }

    public double getKreditLimit() {
        return kreditLimit;
    }

    public double getZinsGuthaben() {
        return zinsGuthaben;
    }

    public void setKreditLimit(double kreditLimit) {
        this.kreditLimit = kreditLimit;
    }

    public void setZinsGuthaben(double zinsGuthaben) {
        this.zinsGuthaben = zinsGuthaben;
    }
    public void einzahlen(double betrag){
        this.kontoStand = this.kontoStand + betrag;

    }
    public boolean auszahlen(double betrag){
        boolean auszahlen ;
        if (kontoStand >= betrag ){
         this.kontoStand = this.kontoStand - betrag;
         auszahlen = true;
            System.out.println("Auszahlung erfolgreich !");

        }
        else {
            auszahlen = false ;
            System.out.println("Auszahlung fehlgeschlagen !");

        }return auszahlen;

    }

    @Override
    public String toString() {
        String text = "Inhaber :" + getInhaber();
               text+= "\n\tKontostand :" + getKontoStand();
               text+= "\n\tKreditlimit :" + getKreditLimit();
               text+= "\n\tZinsguthaben :" + getZinsGuthaben();
               return text;
    }
}
