package Creational.Builder;

/*
    Author: Tsz Yan "Kenneth" Wong

    Concepts:
        - Great for handling the construction of objects that may contain a lot of parameters
        - Want to make the objects immutable once they are constructed

        * Large number of parameters
        * Complex constructors
        * Immutability

        - Examples:
            - StringBuilder
            - DocumentBuilder
            - Locale.Builder
 */

public class DinnerOrder {
    public static class OrderBuilder {
        private int customerId;
        private String drink = "Coke"; // default
        private String burger = "Chicken Burger"; // default
        private boolean fries;
        private boolean cheese;
        private String toGo = "Stay"; // default

        public OrderBuilder(int customerId) {
            this.customerId = customerId;
        }

        public DinnerOrder build() {
            return new DinnerOrder(this);
        }

        public OrderBuilder setDrink(String drink) {
            this.drink = drink;
            return this;
        }

        public OrderBuilder setBurger(String burger) {
            this.burger = burger;
            return this;
        }

        public OrderBuilder addFries() {
            this.fries = true;
            return this;
        }

        public OrderBuilder addCheese() {
            this.cheese = true;
            return this;
        }

        public OrderBuilder toGoOrStay(String toGoOrNot) {
            this.toGo = toGoOrNot;
            return this;
        }
    }

    private int customerId;
    private String drink;
    private String burger;
    private boolean fries;
    private boolean cheese;
    private String toGo;

    private DinnerOrder(OrderBuilder ob) {
        this.customerId = ob.customerId;
        this.drink = ob.drink;
        this.burger = ob.burger;
        this.cheese = ob.cheese;
        this.fries = ob.fries;
        this.toGo = ob.toGo;
    }

    public int getCustomerId() { return customerId; }

    public String getDrink() {
        return drink;
    }

    public String getBurger() {
        return burger;
    }

    public boolean getFries() {
        return fries;
    }

    public boolean getCheese() {
        return cheese;
    }

    public String getToGoOrStay() {
        return toGo;
    }
}
