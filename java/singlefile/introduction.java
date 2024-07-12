import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("What's your name? ");
            String name = scanner.nextLine();

            System.out.print("How old are you? ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.print("How many years of experience do you have? ");
            int years = Integer.parseInt(scanner.nextLine());

            System.out.println("Hello " + name + ", I see you're " + age + " years old and have " + years + " years of experience!");
        } catch (Exception err) {
            System.out.println("An error occurred: " + err.getMessage());
        } finally {
            scanner.close();
        }
    }
}
