package schritt1;

public class Ergebnis {
    private int erzielteTrefferHeim;
    private int erzielteTrefferGast;

    public int getErzielteTrefferHeim() {
        return erzielteTrefferHeim;
    }

    public int getErzielteTrefferGast() {
        return erzielteTrefferGast;
    }

    public void addToreHeim() {
        erzielteTrefferHeim ++;
    }

    public void addToreGast() {
       erzielteTrefferGast++;
    }

    @Override
    public String toString() {
        String text = "\n\t" + "Erzielte Treffer Heim:" + getErzielteTrefferHeim();
        text = text + "\n\t" + "Erzielte Treffer Gast " + getErzielteTrefferGast();
        return text;

    }
}




