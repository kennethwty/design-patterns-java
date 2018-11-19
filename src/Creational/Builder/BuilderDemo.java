package Creational.Builder;

/*
    Driver for the Builder Design Pattern
 */

public class BuilderDemo {
    public static void main(String[] args) {
        DinnerOrder.OrderBuilder builder = new DinnerOrder.OrderBuilder(1);
        builder.setDrink("Coffee").setBurger("Double Cheese Burger").addCheese();

        DinnerOrder order = builder.build();

        System.out.println("Customer ID: " + order.getCustomerId());
        System.out.println("Choice of Burger: " + order.getBurger());
        System.out.println("Choice of Drink: " + order.getDrink());
        System.out.println("Add Cheese: " + order.getCheese());
        System.out.println("Add Fries: " + order.getFries());
        System.out.println("Stay or To-Go: " + order.getToGoOrStay());
    }
}
