package dao;

public class VertragspartnerDao {
    private final String CLASSNAME = "org.sqlite.JDBC";
    private final String CONNECTIONSTRING = "jdbc:sqlite:KAUFVERTRAGMitDao/src/data/Kaufvertrag.db";

    public VertragspartnerDao() throws ClassNotFoundException {
        Class.forName(CLASSNAME);

    }
}
