import java.util.Scanner;

public class OtherLoop {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double averageRating = 0;
        double evaluation  = 0;
        int ratingsMade = 0;

        while (evaluation != -1) {
            System.out.println("Enter your evaluation for the film or press -1 to finish: ");
            evaluation = reader.nextDouble();
            
            if (evaluation != -1) {
                averageRating += evaluation;
                ratingsMade++;
            }
        }

        System.out.println("Average rating: " + averageRating / ratingsMade);

        reader.close();
    }
}
