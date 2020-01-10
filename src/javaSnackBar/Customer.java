package javaSnackBar;

public class Customer {

    private static int currentId = 0;

    private int id;
    private String name;
    private double cash;

    public Customer(String name, double cash){

        currentId++;
        id = currentId;
        this.name = name;
        this.cash = cash;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void buyItem(double price, int quantity) {
        cash -= (price * quantity);
    }

    public void addCash(double amount){
        cash += amount;
    }

    public double getCash() {
        return cash;
    }
}