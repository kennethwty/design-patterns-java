package Creational.Singleton;

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

public class Single {
    private static volatile Single me = null;

    private Single() {
        // prevent Reflection
        if(me != null) {
            throw new RuntimeException("Use getInstance() to create.");
        }
    }

    public static Single getInstance() {
        // lazily loaded
        if(me == null) {
            synchronized (Single.class) {
                if(me == null) {
                    me = new Single();
                }
            }
        }
        return me;
    }

    public static void main(String[] args) {
        Single lonelyObject = Single.getInstance();
        Single robot = Single.getInstance();

        if(lonelyObject == robot) {
            System.out.println("Glad that it is not a lonely person...");
        }
    }
}
