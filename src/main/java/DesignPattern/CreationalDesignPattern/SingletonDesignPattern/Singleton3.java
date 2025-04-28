package DesignPattern.CreationalDesignPattern.SingletonDesignPattern;

/*
    * lazy connection with synchronised
    * thread safe
    * getInstance becomes a very heavy method as every time locking happens
 */
public class Singleton3 {
    private static DBConnection db;
    private Singleton3() {}

    public static synchronized DBConnection getInstance() {
        if (db == null) {
            db = new DBConnection();
        }
        return db;
    }
}
