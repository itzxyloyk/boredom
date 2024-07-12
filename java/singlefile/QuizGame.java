import java.util.Scanner;

public class QuizGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int score = 0;

        System.out.println("Welcome to the General Knowledge Quiz!");

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

        // Display final score
        System.out.println("\nQuiz completed!");
        System.out.println("Your final score is: " + score + " out of 3.");

        scanner.close();
    }
}
