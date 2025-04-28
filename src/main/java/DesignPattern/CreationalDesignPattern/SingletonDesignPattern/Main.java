package DesignPattern.CreationalDesignPattern.SingletonDesignPattern;

/*
    * Singleton ensures that only one instance of a class is ever created.
    * It also provides a global point of access to that instance.
    * Problem ->	You want to restrict object creation to only one instance
    * Solution ->   Private constructor + Static instance + Public accessor method.
    * Good for ->   Database, Logger, Caches, Configuration, Managers
 */
public class Main {
    public static void main(String[] args) {
        DBConnection obj1 = Singleton4.getInstance();
        DBConnection obj2 = Singleton4.getInstance();

        System.out.println("Both are same objects ? -> "+ (obj1 == obj2));

        DBConnection obj3 = Singleton5.getInstance();
        DBConnection obj4 = Singleton5.getInstance();

        System.out.println("Both are same objects ? -> "+ (obj3 == obj4));

    }
}
