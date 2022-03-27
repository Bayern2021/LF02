public class Programm {
    public static void main(String[] args) {
    Schmuck rolex = new Schmuck(5,5.7,"Rolex");
    Aktie bank = new Aktie(7,7.8, "Commerzbank",6.8);
    Schmuck armband = new Schmuck(6,8.8,"Armband");
    Aktie wohnung = new Aktie(9,5.3,"Espabu",9.2);
        Tresor tresor = new Tresor();
        tresor.addGegenstand(rolex);
        tresor.addGegenstand(bank);
        tresor.addGegenstand(armband);
        tresor.addGegenstand(wohnung);
        System.out.println(tresor.toString());
    }
}
