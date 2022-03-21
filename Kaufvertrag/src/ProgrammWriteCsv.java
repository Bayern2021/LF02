import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class ProgrammWriteCsv {
    public static void main(String[] args) throws FileNotFoundException {
        Ware ware = new Ware("Laptop", 250.0);
        ware.setBeschreibung("Super krasses Gaming-Laptop");
        ware.getBesonderheiten().add("Tasche");
        ware.getBesonderheiten().add("Gaming-Maus");
        ware.getMaengel().add("Ladekabel fehlt");
        ware.getMaengel().add("Touchpad defekt");

        Vertragspartner kaeufer = new Vertragspartner("Klaus", "Brandt");
        kaeufer.setAusweisNr("0123456789");
        kaeufer.setAdresse(new Adresse("Zu Hause", "3a", "28199", "Bremen"));

        Vertragspartner verkaeufer = new Vertragspartner("Joachim", "Bredull");
        verkaeufer.setAusweisNr("9876543210");
        verkaeufer.setAdresse(new Adresse("Auch zu Hause", "7", "28195", "Bremen"));

        Kaufvertrag vertrag = new Kaufvertrag(verkaeufer, kaeufer, ware);
        vertrag.setZahlungsModalitaeten("Privater Barverkauf");


            erstelleCsv(vertrag);

    }
    private static void erstelleCsv(Kaufvertrag kaufvertrag) throws FileNotFoundException {
        String datei = "C:\\Users\\Mohamed\\IdeaProjects\\LF02\\Kaufvertrag\\Data\\Kaufvertrag.csv";
        PrintWriter writer = new PrintWriter(datei);
        writer.println("\n\t"+"Vertragspartner ;" + "Name ;" + "Straße ;" + "Plz ;" + "Ort");

        writer.print("Käufer ;");
        writer.print(kaufvertrag.getKaeufer().getVorname()+" "+ kaufvertrag.getKaeufer().getNachname()+";");
        writer.print(kaufvertrag.getKaeufer().getAusweisNr()+";");
        writer.print(kaufvertrag.getKaeufer().getAdresse().getStrasse()+" "+kaufvertrag.getKaeufer().getAdresse().getHausNr()+";");
        writer.println(kaufvertrag.getKaeufer().getAdresse().getPlz()+" "+kaufvertrag.getKaeufer().getAdresse().getOrt());

        writer.print("Verkäufer ;");
        writer.print(kaufvertrag.getVerkaeufer().getVorname()+" "+kaufvertrag.getVerkaeufer().getNachname()+";");
        writer.print(kaufvertrag.getVerkaeufer().getAusweisNr()+";");
        writer.print(kaufvertrag.getVerkaeufer().getAdresse().getStrasse()+" "+kaufvertrag.getVerkaeufer().getAdresse().getHausNr()+";");
        writer.println(kaufvertrag.getVerkaeufer().getAdresse().getPlz()+" "+kaufvertrag.getVerkaeufer().getAdresse().getOrt());



        writer.close();
        





    }
}
