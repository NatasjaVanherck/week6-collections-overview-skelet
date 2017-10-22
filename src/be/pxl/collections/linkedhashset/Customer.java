package be.pxl.collections.linkedhashset;

public class Customer {
    private String name;
    private int points;
    private int customerNumber;

    public Customer(int customerNumber, String name) {
        this.name = name;
        this.customerNumber = customerNumber;
        points = 0;
    }

    public int addPoints(int pointsToAdd) {
        points += pointsToAdd;
        return points;
    }

    public int getPoints() {
        return points;
    }

    public int getCustomerNumber() {
        return customerNumber;
    }
}
