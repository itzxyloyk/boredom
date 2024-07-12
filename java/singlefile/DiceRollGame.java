import java.util.Random;
import java.util.Scanner;

public class DiceRollGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Dice Rolling Game!");
        System.out.println("You will roll two dice and try to match a target number.");

        System.out.print("Enter the target number (2 to 12): ");
        int targetNumber = scanner.nextInt();

        if (targetNumber < 2 || targetNumber > 12) {
            System.out.println("Invalid target number! Please enter a number between 2 and 12.");
            return;
        }

        int dice1 = random.nextInt(6) + 1;
        int dice2 = random.nextInt(6) + 1;
        int sum = dice1 + dice2;

        System.out.println("You rolled: " + dice1 + " and " + dice2);
        System.out.println("Sum of dice: " + sum);

        if (sum == targetNumber) {
            System.out.println("Congratulations! You matched the target number " + targetNumber + ".");
        } else {
            System.out.println("Sorry, you did not match the target number " + targetNumber + ".");
        }

        scanner.close();
    }
}
