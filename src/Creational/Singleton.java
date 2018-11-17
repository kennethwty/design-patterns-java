package Creational;

/*
    Author: Tsz Yan "Kenneth" Wong

    Concepts:
        - Only one instance created
        - Guarantees control of a resource
        - Lazily loaded
        - Examples:
            - Graphic Manager
            - Logger
            - Runtime
            - Spring Beans
 */

public class Singleton {
    private static volatile Singleton me = null;

    private Singleton() {
        // prevent Reflection
        if(me != null) {
            throw new RuntimeException("Use getInstance() to create.");
        }
    }

    public static Singleton getInstance() {
        // lazily loaded
        if(me == null) {
            synchronized (Singleton.class) {
                if(me == null) {
                    me = new Singleton();
                }
            }
        }
        return me;
    }

    public static void main(String[] args) {
        Singleton lonelyObject = Singleton.getInstance();
        Singleton robot = Singleton.getInstance();

        if(lonelyObject == robot) {
            System.out.println("Glad that it is not a lonely person...");
        }
    }
}
