public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Screen Match");

        int launchYear = 2022;
        double movieScore = 8.1;
        // Average calculated from 3 ratings from 3 diferent people
        double average = (9.8 + 6.3 + movieScore) / 3;

        String synopsis = "Adventure movie with an 80's heartthrob.";
        String fullSynopsis = """
            Movie: Top Gun: Maverik
            Launch Year: %d
            Avarege: %f
            Synopsis: %s
            """.formatted(launchYear, average, synopsis);

        System.out.println(fullSynopsis);

        int classification = (int) average / 2;

        System.out.println("Classification: " + classification);
    }
}