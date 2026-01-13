import java.util.Scanner;

//cost of gasoline 
// average fess per day 
//  toll per day
class CarPooling {
    public static void main(String []args){
        Scanner input = new Scanner(System.in);
        System.out.println("enter distance in miles you drive on average day :");
        double miles = input.nextDouble();
        System.out.println("enter the price of gasoline per gallon :$");
        double Gasoline = input.nextDouble();
        System.out.println("enter your car fees you have to pay :$");
        double fees = input.nextDouble();
        System.out.println("The price of tolls you paid in a average day  ");
        double tolls = input.nextDouble();
        double drivingCost = miles*Gasoline + fees + tolls;
        System.out.println("your daily driving cost is :"+drivingCost);
        

    }
}
