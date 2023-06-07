public class Conditional {
    public static void main(String[] args) {
        int launchYear = 1990;
        boolean includedInThePlan = true;
        double movieScore = 8.1;
        String planType = "plus";

        if (launchYear >= 2022) {
            System.out.println("Releases that users are enjoying!");
        } else {
            System.out.println("Retro movie worth watching!");
        }

        if (includedInThePlan == true || planType.equals("plus")) {
            System.out.println("Movie released to watch.");
        } else {
            System.out.println("You must pay the rent to see this movie.");
        }
    }
}
