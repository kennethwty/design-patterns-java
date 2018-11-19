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

public abstract class ProductItem implements Cloneable{
    private String productTitle;
    private double productPrice;
    private int productQuantity;
    private String productURL;

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getProductTitle() {
        return productTitle;
    }

    public void setProductTitle(String productTitle) {
        this.productTitle = productTitle;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductQuantity() {
        return productQuantity;
    }

    public void setProductQuantity(int productQuantity) {
        this.productQuantity = productQuantity;
    }

    public String getProductURL() {
        return productURL;
    }

    public void setProductURL(String productURL) {
        this.productURL = productURL;
    }
}
