import java.util.Scanner;

public class GasMileage {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int miles;
        int gallons;
        int totalMiles = 0;
        int totalGallons = 0;

        System.out.print("Enter miles driven (-1 to quit): ");
        miles = sc.nextInt();

        while (miles != -1) {

            System.out.print("Enter gallons used: ");
            gallons = sc.nextInt();

            double mpg = (double) miles / gallons;
            System.out.println("Miles per gallon for this trip: " + mpg);

            totalMiles += miles;
            totalGallons += gallons;

            double totalMpg = (double) totalMiles / totalGallons;
            System.out.println("Combined miles per gallon: " + totalMpg);
            System.out.println();

            System.out.print("Enter miles driven (-1 to quit): ");
            miles = sc.nextInt();
        }

        sc.close();
    }
}
