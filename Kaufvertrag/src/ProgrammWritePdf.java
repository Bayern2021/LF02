import com.itextpdf.io.font.constants.StandardFonts;
import com.itextpdf.io.font.otf.Glyph;
import com.itextpdf.io.font.otf.GlyphLine;
import com.itextpdf.kernel.colors.DeviceRgb;
import com.itextpdf.kernel.font.PdfFont;
import com.itextpdf.kernel.font.PdfFontFactory;
import com.itextpdf.kernel.pdf.*;
import com.itextpdf.layout.Document;
import com.itextpdf.layout.element.IElement;
import com.itextpdf.layout.element.Paragraph;
import com.itextpdf.layout.property.TextAlignment;

import javax.swing.event.DocumentListener;
import javax.swing.event.UndoableEditListener;
import javax.swing.text.*;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public class ProgrammWritePdf {
    public static void main(String[] args) throws IOException {
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


        String datei = "C:\\Users\\Mohamed\\IdeaProjects\\LF02\\Kaufvertrag\\Data\\Kaufvertrag.pdf" ;
        PdfWriter writer = new PdfWriter(datei) ;
        PdfDocument pdfDocument = new PdfDocument(writer);
        Document document = new Document(pdfDocument);
        PdfFont font = PdfFontFactory.createFont(StandardFonts.HELVETICA);
        document.setFont(font);
        document.setFontSize(12);
        document.setBold();
        document.setItalic();
        document.setUnderline();
        document.setTextAlignment(TextAlignment.LEFT);
        document.setFontColor(new DeviceRgb(50,100,150));

        Paragraph p1 = new Paragraph("Kaufvertrag");
        p1.add("\n");
        p1.add("Käufer");
        p1.add(kaeufer.getVorname()+"," + kaeufer.getNachname()+";");
        p1.add(kaeufer.)
        p1.add("\n");
        p1.add("Verkäufer");
        document.add(p1);
        document.close();
    }
}
