import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        String[] choices = {"Rock", "Paper", "Scissors"};
        String userChoice, computerChoice;
        int computerChoiceIndex;

        System.out.println("Welcome to Rock, Paper, Scissors!");
        System.out.println("Please enter your choice (Rock, Paper, or Scissors): ");
        
        userChoice = scanner.nextLine();

        computerChoiceIndex = random.nextInt(3);
        computerChoice = choices[computerChoiceIndex];

        System.out.println("Computer chose: " + computerChoice);

        if (userChoice.equalsIgnoreCase(computerChoice)) {
            System.out.println("It's a tie!");
        } else if (userChoice.equalsIgnoreCase("Rock")) {
            if (computerChoice.equals("Scissors")) {
                System.out.println("You win! Rock crushes Scissors.");
            } else {
                System.out.println("You lose! Paper covers Rock.");
            }
        } else if (userChoice.equalsIgnoreCase("Paper")) {
            if (computerChoice.equals("Rock")) {
                System.out.println("You win! Paper covers Rock.");
            } else {
                System.out.println("You lose! Scissors cuts Paper.");
            }
        } else if (userChoice.equalsIgnoreCase("Scissors")) {
            if (computerChoice.equals("Paper")) {
                System.out.println("You win! Scissors cuts Paper.");
            } else {
                System.out.println("You lose! Rock crushes Scissors.");
            }
        } else {
            System.out.println("Invalid input! Please enter Rock, Paper, or Scissors.");
        }

        scanner.close();
    }
}
