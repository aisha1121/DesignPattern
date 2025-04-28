package DesignPattern.CreationalDesignPattern.SingletonDesignPattern;

/*
    * lazy loading
    * initialises object only when called
    * not thread safe
 */
public class Singleton2 {
    private static DBConnection db;

    private Singleton2() {
    }

    public static DBConnection getInstance() {
        if (db == null) {
            db = new DBConnection();
        }
        return db;
    }

}
