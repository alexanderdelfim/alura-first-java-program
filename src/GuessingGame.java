import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // The number that should be guessed
        int generatedNumber = new Random().nextInt(100);
        int tries = 1;
        
        while (tries <= 5) {
            System.out.println("Enter a number between 0 to 100 to try to guess: ");
            int inputedNumber = reader.nextInt();
            tries++;

            if (inputedNumber == generatedNumber) {
                System.out.println("Congratulations, you guessed the number %d!".formatted(generatedNumber));

                break;
            } else if (inputedNumber > generatedNumber) {
                System.out.println("The number entered is greater than the number to be guessed.");
            } else {
                System.out.println("The number entered is less than the number to be guessed.");
            }            
        }
        
        if (tries == 5) {
            System.out.println("You failed to guess the number, the correct number was %d".formatted(generatedNumber));
        }

        reader.close();
    }
}
