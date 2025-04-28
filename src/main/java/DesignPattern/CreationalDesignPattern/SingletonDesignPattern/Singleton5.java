package DesignPattern.CreationalDesignPattern.SingletonDesignPattern;

/*
    * Bill Pugh Singleton Pattern
    * Super lazy — object is created only when needed.
    * No synchronization — so very fast.
    * Thread-safe — uses Java's class loader magic
    * So, no extra synchronization, no performance loss.
 */
public class Singleton5 {
    private Singleton5() {}

    public static DBConnection getInstance() {
        return DBConnectionHolder.INSTANCE;
    }

    private static class DBConnectionHolder {
        private static final DBConnection INSTANCE = new DBConnection();
    }
}
