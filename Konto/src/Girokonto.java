public class Girokonto  extends Konto{
    private double zinsKredit ;
    public Girokonto(Kunde inhaber , double kreditlimit,double zinsGuthaben ,double zinsKredit){
        super(inhaber,0,kreditlimit,zinsGuthaben);
        this.zinsKredit = zinsKredit ;
    }

    public double getZinsKredit() {
        return zinsKredit;
    }

    public void setZinsKredit(double zinsKredit) {
        this.zinsKredit = zinsKredit;
    }
    public boolean ueberweisen(double betrag,Girokonto girokonto){
        boolean ueberweisen ;
        if ()

    }
}
