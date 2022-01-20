package schritt1;


import java.util.ArrayList;

public class Mannschaft {
    private String name ;
    private Trainer trainer;
    private Torwart torwart;
    private ArrayList<Spieler> spielerArrayList;
    private int motivation;
    private int motivationMittelwert;

    public Mannschaft(String name,Trainer trainer,Torwart torwart,ArrayList<Spieler> spielerArrayList ,int motivation){
        this.name = name;
        this.trainer= trainer;
        this.torwart = torwart;
        this.spielerArrayList = spielerArrayList;
        this.motivation = motivation;
    }

    public String getName() {
        return name;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public Torwart getTorwart() {
        return torwart;
    }

    public ArrayList<Spieler> getSpielerArrayList() {
        return spielerArrayList;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public void setTorwart(Torwart torwart) {
        this.torwart = torwart;
    }

    public void setSpielerArrayList(ArrayList<Spieler> spielerArrayList) {
        this.spielerArrayList = spielerArrayList;
    }

    public int getMotivation() {
        for (Spieler i:
             spielerArrayList) {
            motivation += i.getMotivation();

        }
        motivation+= torwart.getMotivation();
        motivationMittelwert= motivation/(spielerArrayList.size()+1);
        return motivation;
    }

}
