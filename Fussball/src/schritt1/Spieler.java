package schritt1;

public class Spieler extends Person {
   private int staerke ;
   private int torschuss ;
   private int motivation ;
    private int tore ;

    public Spieler (String name,int alter, int staerke, int torschuss,int motivation,int tore){
        super(name,alter);
        this.staerke = staerke ;
        this.torschuss = torschuss ;
        this.motivation = motivation ;
        this.tore = tore ;


    }
    public int getStaerke(){
        return staerke;
    }
    public int getTorschuss(){
        return torschuss ;
    }
    public int getMotivation(){
        return motivation ;
    }
    public int getTore(){
        return tore ;
    }


    public void setStaerke(int staerke){
        this.staerke = staerke ;
    }
    public void setTorschuss(int torschuss){
        this.torschuss = torschuss;
    }
    public void setMotivation(int motivation){
        this.motivation = motivation;
    }
    public void setTore(int tore){
        this.tore = tore;
    }

    @Override
    public String toString(){
        String text ="Name:"+getName() ;
        text = text + "\n\t" + "Alter:" +getAlter() ;
        text = text+ "\n\t"+"Stärke:"+staerke;
        text = text+ "\n\t"+"Torschuss:"+torschuss;
        text = text+ "\n\t"+"Motivation:"+motivation;
        text = text+ "\n\t"+"Tore:"+tore;
        return text;
    }


}
