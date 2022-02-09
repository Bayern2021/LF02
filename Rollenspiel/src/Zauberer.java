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
    public void zaubern(){
        zauberpunkte = zauberpunkte -1 ;
    }

    @Override
    public String toString() {
        String text = "Name :"+ getName();
        text = text + "\n\t" + "Zauberpunkte :" + getZauberpunkte();
        return text;
    }
}
