import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double averageRating = 0;
        double evaluation  = 0;

        for (int i = 0; i < 3; i++) {
            System.out.println("Enter your evaluation for the film: ");
            evaluation = reader.nextDouble();
            averageRating += evaluation;
        }

        System.out.println("Average rating: " + averageRating / 3);

        reader.close();
    }
}
