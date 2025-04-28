package DesignPattern.CreationalDesignPattern.SingletonDesignPattern;

/*
    * eager initialisation
    * one single instance at the time class is loaded
    * thread safe
    * fast
    * not use for heavy and rarely used instances
 */
public class Singleton1 {
    private static final DBConnection db = new DBConnection();

    private Singleton1() {}

    public static DBConnection getInstance() {
        return db;
    }
}
