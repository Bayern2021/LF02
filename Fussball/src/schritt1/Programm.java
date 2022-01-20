package schritt1;

public class Programm {
    public static void main(String[] args) {
        Trainer trainer = new Trainer("Nagelsmann",20,7);
        Spieler spieler = new Spieler("Christoph",23,10,10,6,580);
        Torwart torwart = new Torwart("Aaron",17,9,8,8);

        System.out.println(trainer);

        System.out.println(spieler);

        System.out.println(torwart);






    }
}
