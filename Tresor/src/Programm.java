import java.util.ArrayList;

public class Programm {
    public static void main(String[] args) {
     Schmuck rolex = new Schmuck (5,6,"Rolex ") ;
     Aktie bank = new Aktie(9,7.5 ,"Commerzbank",10);
     Tresor tresor = new Tresor();
     tresor.addGegenstand(rolex);
     tresor.addGegenstand(bank);
        System.out.println(tresor.toString());


    }
}
