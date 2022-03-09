public abstract class Gegenstand {
    private int id ;
    private double wert ;

    public Gegenstand (int id , double wert){
        this.id = id ;
        this.wert = wert ;

    }
    public int getId() {
        return id;
    }
    public double getWert() {
        return wert;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        String text = "ID  :" + getId();
               text+= "\n\t" + "Wert :" + getWert() ;
               return text;
    }
}
