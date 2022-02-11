public class Zauberer extends Spielfigur{
    private int zauberpunkte ;

    public Zauberer(String name ,int staerkepunkte , int zauberpunkte){
        super(name ,staerkepunkte);
        this.zauberpunkte = zauberpunkte ;
    }

    public int getZauberpunkte() {
        return zauberpunkte;
    }
    public void trinkenZaubertrank(){
        zauberpunkte = zauberpunkte +3;
    }
    public void zaubern() throws KeineKraftException {
        if (zauberpunkte>= 1){
            System.out.println(getName()+"zaubert ");
            zauberpunkte = zauberpunkte -1 ;

        }
        else {
            throw new KeineKraftException(getName(),"Zaubern");
        }

    }

    @Override
    public String toString() {
        String text = super.toString();
        text = text + "\n\t" + "Zauberpunkte :" + getZauberpunkte();
        return text;
    }
}
