package schritt1;

import java.util.ArrayList;

public class Programm {
    public static void main(String[] args) {
        Trainer trainer1 = new Trainer("Nagelsmann",20,7);
        Spieler spieler1 = new Spieler("Christoph",23,10,10,6,580);
        Torwart torwart1 = new Torwart("Aaron",17,9,8,8);
        Spieler spieler2 = new Spieler("Yannick",18,9,6,5,4);
        Spieler spieler3 = new Spieler("Mohamed",17,9,7,8,6);
        ArrayList<Spieler> spielerArrayListHeim = new ArrayList<>();
        spielerArrayListHeim.add(spieler1);
        spielerArrayListHeim.add(spieler2);
        spielerArrayListHeim.add(spieler3);
        Mannschaft heim = new Mannschaft("Bayern München",trainer1,torwart1,spielerArrayListHeim);
        Trainer trainer2 = new Trainer("Rose",45,5);
        Torwart torwart2 = new Torwart("Lucas",20,3,9,8);
        Spieler spieler4 = new Spieler("Hatem",17,4,3,7,0);
        Spieler spieler5 = new Spieler("Mika",3,0,1,0,0);
        Spieler spieler6 = new Spieler("Abdul",21,3,2,0,1);
        ArrayList<Spieler> spielerArrayListGast = new ArrayList<>();
        spielerArrayListGast.add(spieler4);
        spielerArrayListGast.add(spieler5);
        spielerArrayListGast.add(spieler6);
        Mannschaft gast = new Mannschaft("Borussia Dortmund",trainer2,torwart2,spielerArrayListGast);


        System.out.println(heim);

        System.out.println(gast);

        Ergebnis ergebnis = new Ergebnis();
        ergebnis.setErzielteTrefferHeim();

        Spiel spiel = new Spiel(heim,gast,ergebnis);
        System.out.println(spiel);








    }
}
