public class GegenstandNichtGefundenException extends Throwable {
    private int id ;

    public GegenstandNichtGefundenException(int id) {
        this.id = id ;
    }

    public int getId() {
        return id;
    }
    public String getMessage(){
        return "Der Ggegenstand mit der Id ("+id+") wurde nicht gefunden";
    }


}
