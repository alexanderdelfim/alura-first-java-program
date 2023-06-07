public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Screen Match");
        System.out.println("Movie: Top Gun: Maverik");

        int launchYear = 2022;

        System.out.println("Launch Year: " + launchYear);

        boolean includedOnThePlan = true;
        double movieScore = 8.1;

        // Average calculated from 3 ratings from 3 diferent people
        double average = (9.8 + 6.3 + 8.0) / 3;

        System.out.println("Avarege: " + average);

        // String synopsis = "Adventure movie with an 80's heartthrob.";
        String synopsis = """
            Movie: Top Gun: Maverik
            Launch Year: 2022
            Avarege: 8.0
            Synopsis: Adventure movie with an 80's heartthrob.
                """;

        System.out.println("Synopsis: " + synopsis);
    }
}