public class KeineKraftException extends Exception{
    private String aktion ;
    private String name ;

    public KeineKraftException(String aktion,String name){
        this.aktion = aktion ;
        this.name = name ;

    }

    public String getAktion() {
        return aktion;
    }

    public void setAktion(String aktion) {
        this.aktion = aktion;
    }

    public String getName() {
        return name;
    }

    @Override
    public String getMessage() {
        return name+ "Zu Schwach zur Aktion :"+aktion;
    }
}
