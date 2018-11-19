package Creational.Prototype;

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
