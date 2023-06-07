import java.util.Scanner;

public class Reader {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Enter your favorite movie: ");
        String movie = reader.nextLine();

        System.out.println("What is the launch year of this movie? ");
        int launchYear = reader.nextInt();

        System.out.println("What is your score for this movie? ");
        double score = reader.nextDouble();
        
        System.out.println("""
            Favorite movie: %s
            Launch Year: %d
            Score: %f
            """.formatted(movie, launchYear, score));

        reader.close();
    }
}
