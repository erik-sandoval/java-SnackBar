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

        //Customer 1 (Jane) buys 3 of snack 4 (Soda). Print Customer 1 (Jane) Cash on hand. Print quantity of snack 4 (Soda).
        cs1.buyItem(snack4.getCost(), 3);
        System.out.println(cs1.getName() + ": $" + cs1.getCash());
        System.out.println(snack3.getName() +": " + snack4.getQuantity());
        snack4.setQuantity(-3);
        
        // Customer 1 (Jane) buys 1 of snack 3 (Pretzel). Print Customer 1 (Jane) Cash on hand. Print quantity of snack 3 (Pretzel).
        cs1.buyItem(snack3.getCost(), 1);
        snack3.setQuantity(-1);
        System.out.println(cs1.getName() + ": $" + cs1.getCash());
        System.out.println(snack3.getName() +": " + snack3.getQuantity());
        
        // Customer 2 (Bob) buys 2 of snack 4 (Sode). Print Customer 2 (Bob) Cash on Hand. Print quantity of snack 4 (Soda).
        cs2.buyItem(snack4.getCost(), 2);
        snack4.setQuantity(-2);
        System.out.println(cs2.getName() + ": $" + cs2.getCash());
        System.out.println(snack3.getName() +": " + snack4.getQuantity());
        
        // Customer 1 (Jane) finds $10. Print Customer 1 (Jane) Cash on Hand.
        cs1.addCash(10);
        System.out.println(cs1.getName() + ": $" + cs1.getCash());
        
        // Customer 1 (Jane) buys 1 of snack 2 (Chocolate Bar). Print Customer 1 (Jane) Cash on Hand. Print quantity of snack 2 (Chocolate Bar).
        cs1.buyItem(snack2.getCost(), 1);
        snack2.setQuantity(-1);
        System.out.println(cs1.getName() + ": $" + cs1.getCash());
        System.out.println(snack3.getName() +": " + snack2.getQuantity());
        
        //Add 12 more items to snack 3 (Pretzel). Print quantity of snack 3 (Pretzel).
        snack3.setQuantity(12);
        System.out.println(snack3.getName() +": " + snack3.getQuantity());

        // Customer 2 (Bob) buys 3 of snack 3 (Pretzel). Print Customer 2 (Bob) Cash on hand. Print quantity of snack 3 (Pretzel).

        cs2.buyItem(snack3.getCost(), 3);
        snack4.setQuantity(-3);
        System.out.println(cs2.getName() + ": $" + cs2.getCash());
        System.out.println(snack3.getName() +": " + snack3.getQuantity());
    }

}