package schritt1;

public class SpielAbbruchException extends Exception{
    private int spielminute ;

    public SpielAbbruchException(int spielminute){
        this.spielminute = spielminute ;
    }

    public int getSpielminute() {
        return spielminute;
    }

    @Override
    public String getMessage() {
        return "Spielabbruch in Minute"+ spielminute;
    }
}
