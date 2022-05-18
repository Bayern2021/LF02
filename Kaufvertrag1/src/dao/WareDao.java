package dao;

import businessObjects.Ware;

public class WareDao {
        private final String CLASSNAME = "org.sqlite.JDBC";
        private final String CONNECTIONSTRING = "jdbc:sqlite:KAUFVERTRAGMitDao/src/data/Kaufvertrag.db";

        public WareDao() throws ClassNotFoundException {
            Class.forName(CLASSNAME);



        }
}
