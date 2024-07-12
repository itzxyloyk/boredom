import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class InventoryManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer> inventory = new HashMap<>();

        System.out.println("Welcome to the Inventory Management System!");

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add an item");
            System.out.println("2. Remove an item");
            System.out.println("3. View inventory");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the item name to add: ");
                    String itemName = scanner.nextLine().trim();
                    System.out.print("Enter the quantity to add: ");
                    int quantityToAdd = scanner.nextInt();
                    scanner.nextLine(); // Consume newline

                    if (inventory.containsKey(itemName)) {
                        int currentQuantity = inventory.get(itemName);
                        inventory.put(itemName, currentQuantity + quantityToAdd);
                    } else {
                        inventory.put(itemName, quantityToAdd);
                    }
                    System.out.println(quantityToAdd + " " + itemName + "(s) added to inventory.");
                    break;

                case 2:
                    System.out.print("Enter the item name to remove: ");
                    String itemToRemove = scanner.nextLine().trim();

                    if (inventory.containsKey(itemToRemove)) {
                        int currentQuantity = inventory.get(itemToRemove);
                        if (currentQuantity > 0) {
                            System.out.print("Enter the quantity to remove: ");
                            int quantityToRemove = scanner.nextInt();
                            scanner.nextLine(); // Consume newline

                            if (quantityToRemove <= currentQuantity) {
                                inventory.put(itemToRemove, currentQuantity - quantityToRemove);
                                System.out.println(quantityToRemove + " " + itemToRemove + "(s) removed from inventory.");
                            } else {
                                System.out.println("Error: Not enough quantity to remove.");
                            }
                        } else {
                            System.out.println("Error: Item is out of stock.");
                        }
                    } else {
                        System.out.println("Error: Item not found in inventory.");
                    }
                    break;

                case 3:
                    System.out.println("\nCurrent Inventory:");
                    for (Map.Entry<String, Integer> entry : inventory.entrySet()) {
                        System.out.println(entry.getKey() + ": " + entry.getValue());
                    }
                    break;

                case 4:
                    System.out.println("Exiting Inventory Management System. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                    break;
            }
        }
    }
}
