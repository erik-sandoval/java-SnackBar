package javaSnackBar;

public class Main {

    public static void main(String[] args) {

        Customer cs1 = new Customer("Jane", 45.25);
        Customer cs2 = new Customer("Bob", 33.14);

        VendingMachine vm1 = new VendingMachine("Food");
        VendingMachine vm2 = new VendingMachine("Drink");
        VendingMachine vm3 = new VendingMachine("Office");

        Snack snack1 = new Snack("Chips", 1.75, 36, vm1.getId());
        Snack snack2 = new Snack("Chocolate Bar", 1.00, 36, vm1.getId());
        Snack snack3 = new Snack("Pretzels", 2.00, 30, vm1.getId());
        Snack snack4 = new Snack("Soda", 2.50, 24, vm2.getId());
        Snack snack5 = new Snack("Water", 2.75, 24, vm2.getId());
    }
}