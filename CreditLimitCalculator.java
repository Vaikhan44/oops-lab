import java.util.Scanner;

public class CreditLimitCalculator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter account number (-1 to quit): ");
        int accountNumber = input.nextInt();

        while (accountNumber != -1) {

            System.out.print("Enter beginning balance: ");
            double beginningBalance = input.nextDouble();

            System.out.print("Enter total charges this month: ");
            double charges = input.nextDouble();

            System.out.print("Enter total credits this month: ");
            double credits = input.nextDouble();

            System.out.print("Enter credit limit: ");
            double creditLimit = input.nextDouble();

            double newBalance = beginningBalance + charges - credits;

            System.out.println("New balance is: " + newBalance);

            if (newBalance > creditLimit) {
                System.out.println("Credit limit exceeded.");
            }

            System.out.println();
            System.out.print("Enter account number (-1 to quit): ");
            accountNumber = input.nextInt();
        }

        input.close();
    }
}
