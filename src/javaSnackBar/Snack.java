package javaSnackBar;

public class Snack {

    private static int currentId = 0;
    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int vendingMachineId;

    public Snack(String name, double cost, int quantity, int vendingMachineId) {
        
        currentId += 1;

        id = currentId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.vendingMachineId = vendingMachineId;
    }

    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name; 
    }

    public void setCost(double price){
        cost = price;
    }
    
    public double getCost(){
        return cost;
    }

    public void setVendingMachineId(int id){
        vendingMachineId = id;
    }

    public int getVendingMachineId(){
        return vendingMachineId;
    }

    public int getQuantity(){
        return quantity;
    }

    public void addQuantity(int quantity){
        this.quantity += quantity;
    }

    public void buySnacks(int quanity){
        this.quantity -= quanity;
    }

    public double getTotalCost(int quanity) {
        return cost * quantity; 
    }

}