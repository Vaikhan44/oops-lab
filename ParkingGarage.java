import java.util.Scanner;

public class ParkingGarage {

    public static double calculateCharges(double hours) {

        double charge = 2.0;

        if (hours > 3) {
            charge += (Math.ceil(hours - 3)) * 0.5;
        }

        if (charge > 10.0) {
            charge = 10.0;
        }

        return charge;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double totalReceipts = 0.0;

        System.out.print("Enter hours parked (-1 to quit): ");
        double hours = input.nextDouble();

        while (hours != -1) {

            double charge = calculateCharges(hours);
            totalReceipts += charge;

            System.out.println("Charge for current customer: $" + charge);
            System.out.println("Running total of receipts: $" + totalReceipts);
            System.out.println();

            System.out.print("Enter hours parked (-1 to quit): ");
            hours = input.nextDouble();
        }

        input.close();
    }
}
