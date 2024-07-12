import java.util.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Random;

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
            System.out.println("3. Quiz Game");
            System.out.println("4. Rock-Paper-Scissors Game");
            System.out.println("5. Exit");
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
                    quizGame();
                    break;
                case 4:
                    rockPaperScissors();
                    break;
                case 5:
                    running = false;
                    System.out.println("Exiting the Turn-Style Game. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
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
                    System.out.println("1. Swim across the river");
                    System.out.println("2. Look for a bridge upstream");
                    System.out.print("Enter your choice: ");
                    int path2 = scanner.nextInt();
                    scanner.nextLine();

                    if (path2 == 1) {
                        System.out.println("\nYou swim across the river and find an old cave.");
                        System.out.println("You enter the cave and discover the hidden treasure chest!");
                        System.out.println("Congratulations! You found the treasure!");
                    } else if (path2 == 2) {
                        System.out.println("\nYou find a rickety bridge upstream. You cross it carefully.");
                        System.out.println("You continue deeper into the forest but get lost.");
                        System.out.println("You decide to turn back.");
                        System.out.println("Game over. Better luck next time!");
                    } else {
                        System.out.println("Invalid choice.");
                    }
                    break;
                case 2:
                    System.out.println("\nYou trek up the mountains. You encounter a steep cliff.");
                    System.out.println("1. Climb the cliff");
                    System.out.println("2. Find a path around the cliff");
                    System.out.print("Enter your choice: ");
                    int path3 = scanner.nextInt();
                    scanner.nextLine();

                    if (path3 == 1) {
                        System.out.println("\nYou successfully climb the cliff and reach a hidden cave.");
                        System.out.println("Inside the cave, you discover the hidden treasure chest!");
                        System.out.println("Congratulations! You found the treasure!");
                    } else if (path3 == 2) {
                        System.out.println("\nYou search for a path around the cliff but encounter dangerous terrain.");
                        System.out.println("You decide to turn back.");
                        System.out.println("Game over. Better luck next time!");
                    } else {
                        System.out.println("Invalid choice.");
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
        }
    }

    private static void quizGame() {
        System.out.println("\nWelcome to the General Knowledge Quiz!");
        boolean playingQuiz = true;
        int score = 0;

        while (playingQuiz) {
            System.out.println("\nQuestion 1: What is the capital city of France?");
            System.out.println("A. London");
            System.out.println("B. Paris");
            System.out.println("C. Rome");
            System.out.print("Your answer: ");
            String answer1 = scanner.nextLine().trim().toUpperCase();

            if (answer1.equals("B")) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is B. Paris.");
            }

            System.out.println("\nQuestion 2: Which planet is known as the Red Planet?");
            System.out.println("A. Venus");
            System.out.println("B. Mars");
            System.out.println("C. Jupiter");
            System.out.print("Your answer: ");
            String answer2 = scanner.nextLine().trim().toUpperCase();

            if (answer2.equals("B")) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is B. Mars.");
            }

            System.out.println("\nQuestion 3: Who painted the Mona Lisa?");
            System.out.println("A. Leonardo da Vinci");
            System.out.println("B. Pablo Picasso");
            System.out.println("C. Vincent van Gogh");
            System.out.print("Your answer: ");
            String answer3 = scanner.nextLine().trim().toUpperCase();

            if (answer3.equals("A")) {
                System.out.println("Correct!");
                score++;
            } else {
                System.out.println("Incorrect. The correct answer is A. Leonardo da Vinci.");
            }

            System.out.println("\nQuiz completed!");
            System.out.println("Your final score is: " + score + " out of 3.");

            playingQuiz = false;
        }
    }

    private static void rockPaperScissors() {
        System.out.println("\nWelcome to Rock, Paper, Scissors!");
        boolean playingRPS = true;

        while (playingRPS) {
            System.out.println("\nChoose your move:");
            System.out.println("1. Rock");
            System.out.println("2. Paper");
            System.out.println("3. Scissors");
            System.out.println("4. Back to main menu");
            System.out.print("Enter your choice: ");

            int userChoice = scanner.nextInt();
            scanner.nextLine();

            if (userChoice == 4) {
                playingRPS = false;
                System.out.println("Returning to main menu.");
                break;
            }

            if (userChoice < 1 || userChoice > 3) {
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                continue;
            }

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
            } else if ((userChoice == 1 && computerChoice == 3) ||
                       (userChoice == 2 && computerChoice == 1) ||
                       (userChoice == 3 && computerChoice == 2)) {
                System.out.println("You win!");
            } else {
                System.out.println("Computer wins!");
            }
        }
    }
}
