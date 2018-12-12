package Creational.Prototype;

/*
    Author: Tsz Yan "Kenneth" Wong

    Concepts:
        - It is used when the type of object to create is determined by prototypical instance, which is cloned to produce a new instance.
        - Used to get a unique instance of the same object
        - Avoids costly creation
        - Avoids subclassing
        - Typically doesn't use the "new" keyword
        - Usually uses an interface
        - Usually implement with a registry
        - Examples:
            - java.lang.Object.clone()

    Design:
        - Clone / Cloneable
        - Even though it is a copy, it is still an unique instance
        - Can still use parameters for construction
        - Especially useful when an app creates a lot of objects which affects performance
            -  This pattern helps obtain these objects faster than creating with the "new" keyword
        - Shallow vs. Deep Copy
            - Shallow Copy: Copy immediate properties
            - Deep Copy: Copy any of its object references as well
 */

public class PrototypeDemo {
    public static void main(String[] args) {
        Registry register = new Registry();
        Book bookA = (Book) register.createProductItem("Book");
        bookA.setProductTitle("Linsanity");
        bookA.setNumOfPages(200);
        bookA.setProductPrice(19.99);
        bookA.setProductURL("www.bmazon.com/books/linsanity");

        System.out.println(bookA);
        System.out.println(bookA.getProductTitle());
        System.out.println(bookA.getNumOfPages());
        System.out.println(bookA.getProductPrice());
        System.out.println(bookA.getProductURL());
        System.out.println(bookA.getProductQuantity()); // default

        Book bookB = (Book) register.createProductItem("Book");
        bookB.setProductTitle("Steve Jobs");
        bookB.setNumOfPages(600);
        bookB.setProductPrice(29.99);
        bookB.setProductURL("www.bmazon.com/books/steve-jobs");

        System.out.println();

        System.out.println(bookB);
        System.out.println(bookB.getProductTitle());
        System.out.println(bookB.getNumOfPages());
        System.out.println(bookB.getProductPrice());
        System.out.println(bookB.getProductURL());
        System.out.println(bookB.getProductQuantity()); // default
    }
}
