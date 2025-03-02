import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the distance in feet: ");
        double distanceFeet = input.nextDouble();
        double distanceYards = distanceFeet / 3;
        double distanceMiles = distanceYards / 1760;
        System.out.println("The distance in yards is " + distanceYards + " and in miles is " + distanceMiles);
    }
}
