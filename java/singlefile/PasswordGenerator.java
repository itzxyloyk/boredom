import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Random Password Generator!");

        System.out.print("Enter the desired length of the password: ");
        int length = scanner.nextInt();

        System.out.print("Include lowercase letters? (yes/no): ");
        boolean includeLowercase = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Include uppercase letters? (yes/no): ");
        boolean includeUppercase = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Include digits? (yes/no): ");
        boolean includeDigits = scanner.next().equalsIgnoreCase("yes");

        System.out.print("Include special characters? (yes/no): ");
        boolean includeSpecial = scanner.next().equalsIgnoreCase("yes");

        String lowercase = "abcdefghijklmnopqrstuvwxyz";
        String uppercase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String digits = "0123456789";
        String special = "!@#$%^&*()-_=+[]{}|;:',.<>?/";

        String characterSet = "";

        if (includeLowercase) {
            characterSet += lowercase;
        }
        if (includeUppercase) {
            characterSet += uppercase;
        }
        if (includeDigits) {
            characterSet += digits;
        }
        if (includeSpecial) {
            characterSet += special;
        }

        if (characterSet.isEmpty()) {
            System.out.println("Error: No character types selected.");
        } else {
            StringBuilder password = new StringBuilder();

            for (int i = 0; i < length; i++) {
                int randomIndex = random.nextInt(characterSet.length());
                password.append(characterSet.charAt(randomIndex));
            }

            System.out.println("Generated password: " + password.toString());
        }

        scanner.close();
    }
}
