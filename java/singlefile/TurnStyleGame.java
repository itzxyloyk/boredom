import java.util.*;

public class TurnStyleGame {
    private static Scanner scanner = new Scanner(System.in);
    private static Map<String, Integer> inventory = new HashMap<>();

    public static void main(String[] args) {
        System.out.println("Welcome to the Turn-Style Game!");
        boolean running = true;

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Inventory Management");
            System.out.println("2. Treasure Hunt Adventure");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    manageInventory();
                    break;
                case 2:
                    treasureHunt();
                    break;
                case 3:
                    running = false;
                    System.out.println("Exiting the Turn-Style Game. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                    break;
            }
        }

        scanner.close();
    }

    private static void manageInventory() {
        System.out.println("\nInventory Management:");
        boolean managingInventory = true;

        while (managingInventory) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add an item");
            System.out.println("2. Remove an item");
            System.out.println("3. View inventory");
            System.out.println("4. Back to main menu");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter the item name to add: ");
                    String itemName = scanner.nextLine().trim();
                    System.out.print("Enter the quantity to add: ");
                    int quantityToAdd = scanner.nextInt();
                    scanner.nextLine();

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
                            scanner.nextLine();

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
                    managingInventory = false;
                    System.out.println("Returning to main menu.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                    break;
            }
        }
    }

    private static void treasureHunt() {
        System.out.println("\nWelcome to the Treasure Hunt Adventure!");

        boolean playingTreasureHunt = true;
        int moves = 0;

        while (playingTreasureHunt) {
            System.out.println("\nYou are at a crossroad. Which path will you take?");
            System.out.println("1. Left towards the forest");
            System.out.println("2. Right towards the mountains");
            System.out.println("3. Back to main menu");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\nYou enter the dense forest. You find a river blocking your path.");
                    System.out.println("To cross the river, answer the following quiz question:");

                    if (quizQuestion()) {
                        System.out.println("You answered correctly! You cross the river and continue.");
                    } else {
                        System.out.println("Incorrect answer! You decide to turn back.");
                        playingTreasureHunt = false;
                    }
                    break;
                case 2:
                    System.out.println("\nYou trek up the mountains. You encounter a steep cliff.");
                    System.out.println("To climb the cliff, win a game of Rock-Paper-Scissors against the guard:");

                    if (playRockPaperScissors()) {
                        System.out.println("You won the game! You climb the cliff and continue.");
                    } else {
                        System.out.println("You lost the game! You decide to turn back.");
                        playingTreasureHunt = false;
                    }
                    break;
                case 3:
                    playingTreasureHunt = false;
                    System.out.println("Returning to main menu.");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                    break;
            }

            moves++;
            if (moves >= 2) {
                System.out.println("You've made too many moves without finding the treasure.");
                System.out.println("Game over. Better luck next time!");
                break;
            }
        }
    }

    private static boolean quizQuestion() {
        System.out.println("\nQuestion: What is the capital city of France?");
        System.out.println("A. London");
        System.out.println("B. Paris");
        System.out.println("C. Rome");
        System.out.print("Your answer: ");
        String answer = scanner.nextLine().trim().toUpperCase();

        return answer.equals("B");
    }

    private static boolean playRockPaperScissors() {
        System.out.println("\nWelcome to Rock-Paper-Scissors!");
        System.out.println("Choose your move:");
        System.out.println("1. Rock");
        System.out.println("2. Paper");
        System.out.println("3. Scissors");
        System.out.print("Enter your choice: ");

        int userChoice = scanner.nextInt();
        scanner.nextLine();

        Random random = new Random();
        int computerChoice = random.nextInt(3) + 1; 

        String userMove = "";
        String computerMove = "";

        switch (userChoice) {
            case 1:
                userMove = "Rock";
                break;
            case 2:
                userMove = "Paper";
                break;
            case 3:
                userMove = "Scissors";
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                return false;
        }

        switch (computerChoice) {
            case 1:
                computerMove = "Rock";
                break;
            case 2:
                computerMove = "Paper";
                break;
            case 3:
                computerMove = "Scissors";
                break;
        }

        System.out.println("You chose: " + userMove);
        System.out.println("Computer chose: " + computerMove);

        if (userChoice == computerChoice) {
            System.out.println("It's a tie!");
            return false;
        } else if ((userChoice == 1 && computerChoice == 3) ||
                   (userChoice == 2 && computerChoice == 1) ||
                   (userChoice == 3 && computerChoice == 2)) {
            System.out.println("You win!");
            return true;
        } else {
            System.out.println("Computer wins!");
            return false;
        }
    }
}
