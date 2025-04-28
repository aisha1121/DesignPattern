package DesignPattern.CreationalDesignPattern.SingletonDesignPattern;

/*
    * Double-checked locking
    * method call becomes faster
    * only first call locking happens when obj is null else simply returns
    * mostly used in organisations as best performance + thread safety
    * NOTE: volatile for DBConnection db;
    * We use volatile in double-checked locking to prevent the JVM from reordering instructions,
    * ensuring complete object construction before publishing the reference to other threads.
 */
public class Singleton4 {
    private static volatile DBConnection db;
    private Singleton4() {}

    public static DBConnection getInstance() {
        if (db == null) { // first check (no locking)
            synchronized (DBConnection.class) {
                if (db == null) { // second check (with locking)
                    db = new DBConnection();
                }
            }
        }
        return db;
    }
}
