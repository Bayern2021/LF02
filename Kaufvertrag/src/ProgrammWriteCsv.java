import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;

public class ProgrammWriteCsv {
    public static void main(String[] args) throws FileNotFoundException {
        csv(KaufvertragErstellen());

    }



    public static Kaufvertrag KaufvertragErstellen() {

        //Käufer

        Vertragspartner Käufer = new Vertragspartner("Azam", "Alali");

        Adresse Käuferadresse = new Adresse("Vohnen", "88", "28307", "Bremen");

        Käufer.setAdresse(Käuferadresse);

        Käufer.setAusweisNr("789650368657");



        //Verkäufer

        Vertragspartner Verkäufer = new Vertragspartner("Mohmaed", "Abazid");

        Adresse Verkäuferadresse = new Adresse("Schwachahusen", "41", "28259", "Bremen");

        Verkäufer.setAdresse(Verkäuferadresse);

        Verkäufer.setAusweisNr("987169854265");



        //Ware

        Ware Ott = new Ware("0,7", 10);





        //Vertrag

        Kaufvertrag kaufvertrag = new Kaufvertrag(Verkäufer, Käufer, Ott);



        return kaufvertrag;

    }



    public static void csv(Kaufvertrag kaufvertrag) throws FileNotFoundException {

        PrintWriter pw = new PrintWriter("C:\\Users\\Mohamed\\IdeaProjects\\LF02\\Kaufvertrag\\Data\\Kaufvertrag.csv");

        pw.print("Vertragsparntner;");

        pw.print("Name;");

        pw.print("Straße;");

        pw.print("PLZ;");

        pw.print("Ort;");

        pw.println("AusweissNr");



        pw.print("Verkaeufer;");

        pw.print(kaufvertrag.getVerkaeufer().getNachname() + "," + kaufvertrag.getVerkaeufer().getVorname() + ";");

        pw.print(kaufvertrag.getVerkaeufer().getAdresse().getStrasse() + "," + kaufvertrag.getVerkaeufer().getAdresse().getHausNr() + ";");

        pw.print(kaufvertrag.getVerkaeufer().getAdresse().getPlz() + ";");

        pw.print(kaufvertrag.getVerkaeufer().getAdresse().getOrt() + ";");

        pw.println(kaufvertrag.getVerkaeufer().getAusweisNr());



        pw.print("Kaeufer;");

        pw.print(kaufvertrag.getKaeufer().getNachname() + "," + kaufvertrag.getKaeufer().getVorname() + ";");

        pw.print(kaufvertrag.getKaeufer().getAdresse().getStrasse() + "," + kaufvertrag.getKaeufer().getAdresse().getHausNr() + ";");

        pw.print(kaufvertrag.getKaeufer().getAdresse().getPlz() + ";");

        pw.print(kaufvertrag.getKaeufer().getAdresse().getOrt() + ";");

        pw.println(kaufvertrag.getKaeufer().getAusweisNr());



        pw.close();


    }
}
