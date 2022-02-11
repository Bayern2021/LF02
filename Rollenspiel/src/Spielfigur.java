public abstract class Spielfigur {
    private String name ;
    private int staerkepunkte ;

    public Spielfigur(String name,int staerkepunkte){
        this.name = name ;
        this.staerkepunkte = staerkepunkte;
    }

    public String getName() {
        return name;
    }

    public int getStaerkepunkte() {
        return staerkepunkte;
    }

    protected void setStaerkepunkte(int staerkepunkte) {
        this.staerkepunkte = staerkepunkte;
    }
    public void essen(){
    staerkepunkte = staerkepunkte +10 ;
    }
    public void laufen() throws KeineKraftException {
        if (staerkepunkte>=1){
            System.out.println(getName()+"läuft");
            staerkepunkte = staerkepunkte -1 ;
        }
        else {
            throw new KeineKraftException(getName(),"Laufen");
        }


    }
    public void kletteren() throws KeineKraftException {
        if (staerkepunkte>=2){
            System.out.println(getName()+"klettert");
            staerkepunkte = staerkepunkte -2 ;

        }
        else {
            throw new KeineKraftException(getName(),"Klettern");
        }

    }
    public void kaempfen() throws KeineKraftException {
        if (staerkepunkte>=3){
            System.out.println(getName()+"kämpft");
            staerkepunkte = staerkepunkte - 3 ;

        }
        else {
            throw new KeineKraftException(getName(),"Kämpfen");
        }

    }

    @Override
    public String toString() {
        String text = "Name :" +getName();
        text = text + "\n\t" + "Stärkepunkte :" + getStaerkepunkte();
        return text ;
    }
}
