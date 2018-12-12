package Creational.Prototype;

import java.util.HashMap;
import java.util.Map;

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

public class Registry {
    Map<String, ProductItem> itemList = new HashMap<>();

    public Registry() {
        loadItems();
    }

    public ProductItem createProductItem(String type) {
        ProductItem item = null;

        try {
            item = (ProductItem) (itemList.get(type)).clone();
        } catch(CloneNotSupportedException e) {
            e.printStackTrace();
        }

        return item;
    }

    public void loadItems() {
        Movie movie = new Movie();
        movie.setMovieLength(115.0);
        movie.setProductPrice(12.0);
        movie.setProductQuantity(1000);
        movie.setProductTitle("Titanic");
        movie.setProductURL("www.bmazon.com/movies/titanic");
        itemList.put("Movie", movie);

        Book book = new Book();
        book.setNumOfPages(500);
        book.setProductPrice(24.0);
        book.setProductQuantity(10000);
        book.setProductTitle("Java Programming for Dummies");
        book.setProductURL("www.bmazon.com/books/java-programming-for-dummies");
        itemList.put("Book", book);

        Clothing jersey = new Clothing();
        jersey.setSeason("All seasons");
        jersey.setProductPrice(99.99);
        jersey.setProductQuantity(10000);
        jersey.setProductTitle("Derrick Rose Timberwolves City Jersey");
        jersey.setProductURL("www.bmazon.com/clothes/jerseys/drose-wolves-city-jersey");
        itemList.put("Clothing", jersey);
    }
}
