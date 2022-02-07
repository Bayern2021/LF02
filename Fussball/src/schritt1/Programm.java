package schritt1;

import java.util.ArrayList;

public class Programm {
    public static void main(String[] args) {
        Trainer trainer1 = new Trainer("Nagelsmann",20,7);
        Spieler spieler1 = new Spieler("Christoph",23,10,10,6,580);
        Torwart torwart1 = new Torwart("Aaron",17,9,8,8);
        Spieler spieler2 = new Spieler("Yannick",18,9,6,5,4);
        Spieler spieler3 = new Spieler("Mohamed",17,9,7,8,6);
        ArrayList<Spieler> spielerListeHeim = new ArrayList<>();
        spielerListeHeim.add(spieler1);
        spielerListeHeim.add(spieler2);
        spielerListeHeim.add(spieler3);
        Mannschaft heim = new Mannschaft("Bayern München",trainer1,torwart1,spielerListeHeim);
        Trainer trainer2 = new Trainer("Rose",45,5);
        Torwart torwart2 = new Torwart("Lucas",20,3,9,8);
        Spieler spieler4 = new Spieler("Hatem",17,4,3,7,0);
        Spieler spieler5 = new Spieler("Mika",3,0,1,0,0);
        Spieler spieler6 = new Spieler("Abdul",21,3,2,0,1);
        ArrayList<Spieler> spielerListeGast = new ArrayList<>();
        spielerListeGast.add(spieler4);
        spielerListeGast.add(spieler5);
        spielerListeGast.add(spieler6);
        Mannschaft gast = new Mannschaft("Borussia Dortmund",trainer2,torwart2,spielerListeGast);


        System.out.println(heim);

        System.out.println(gast);

        Ergebnis ergebnis = new Ergebnis();
        ergebnis.setErzielteTrefferHeim();

        Spiel spiel = new Spiel(heim,gast,ergebnis);
        System.out.println(spiel);

        try{
            Gameplay.spielen(spiel);
        }catch (SpielAbbruchException e){
            System.out.println(e.getMessage());
        }








    }
}
