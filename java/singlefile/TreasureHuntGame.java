import java.util.Scanner;

public class TreasureHuntGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Treasure Hunt Adventure!");
        System.out.println("You are in search of hidden treasure. Choose your path wisely!");

        System.out.println("\nYou are at a crossroad. Which path will you take?");
        System.out.println("A. Left towards the forest");
        System.out.println("B. Right towards the mountains");
        System.out.print("Enter your choice (A or B): ");
        String path1 = scanner.nextLine().trim().toUpperCase();

        if (path1.equals("A")) {
            System.out.println("\nYou enter the dense forest. You find a river blocking your path.");
            System.out.println("A. Swim across the river");
            System.out.println("B. Look for a bridge upstream");
            System.out.print("Enter your choice (A or B): ");
            String path2 = scanner.nextLine().trim().toUpperCase();

            if (path2.equals("A")) {
                System.out.println("\nYou swim across the river and find an old cave.");
                System.out.println("You enter the cave and discover the hidden treasure chest!");
                System.out.println("Congratulations! You found the treasure!");
            } else if (path2.equals("B")) {
                System.out.println("\nYou find a rickety bridge upstream. You cross it carefully.");
                System.out.println("You continue deeper into the forest but get lost.");
                System.out.println("You decide to turn back.");
                System.out.println("Game over. Better luck next time!");
            } else {
                System.out.println("Invalid choice. Game over.");
            }

        } else if (path1.equals("B")) {
            System.out.println("\nYou trek up the mountains. You encounter a steep cliff.");
            System.out.println("A. Climb the cliff");
            System.out.println("B. Find a path around the cliff");
            System.out.print("Enter your choice (A or B): ");
            String path2 = scanner.nextLine().trim().toUpperCase();

            if (path2.equals("A")) {
                System.out.println("\nYou successfully climb the cliff and reach a hidden cave.");
                System.out.println("Inside the cave, you discover the hidden treasure chest!");
                System.out.println("Congratulations! You found the treasure!");
            } else if (path2.equals("B")) {
                System.out.println("\nYou search for a path around the cliff but encounter dangerous terrain.");
                System.out.println("You decide to turn back.");
                System.out.println("Game over. Better luck next time!");
            } else {
                System.out.println("Invalid choice. Game over.");
            }

        } else {
            System.out.println("Invalid choice. Game over.");
        }

        scanner.close();
    }
}
