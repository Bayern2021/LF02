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
    public void laufen(){
        staerkepunkte = staerkepunkte -1 ;
    }
    public void kletteren(){
        staerkepunkte = staerkepunkte -2 ;
    }
    public void kaempfen(){
        staerkepunkte = staerkepunkte - 3 ;
    }

    @Override
    public String toString() {
        String text = "Name :" +getName();
        text = text + "\n\t" + "Stärkepunkte :" + getStaerkepunkte();
        return text ;
    }
}
