package Calculators;
import java.util.Scanner;

public class choice {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Would you like to know your 'Mortgage' or 'Future Value'? ");

        String choice = sc.nextLine();

        if (choice.equals("Mortgage")) {
            System.out.println("What is your total loan amount or Principal? ");

            double P = sc.nextDouble();

            System.out.println("What is the percentage your Annual Interest Rate? ");
            double r = sc.nextDouble() * .01;

            System.out.println("How many years is your loan?");
            double y = sc.nextDouble();

            double n = 12 * y;

            double i = r / 12;


            double M = P * (i * Math.pow(1 + i, n) / (Math.pow(1 + i, n) - 1));
            double totalInterest = (M * n) - P;
            System.out.println("Your Monthly Payment is $" + Math.round(M * 100.0) / 100.0);
            System.out.println("Your Total Interest is $" + Math.round(totalInterest * 100.0) / 100.0);
        }
        else if(choice.equals("Future Value")) {
            System.out.println("What is your initial deposit amount?" );
            double P = sc.nextDouble();

            System.out.println("What is the percentage your Annual Interest Rate" );
            double r = sc.nextDouble() *.01;

            System.out.println("Your total number of years");
            double t = sc.nextDouble();

            double FV = P * Math.pow((1 + (r / 365)), (365 * t));

            double totalInterest = FV - P;

            System.out.println("Your Future Value is $" + Math.round(FV * 100.0) / 100.0);
            System.out.println("Your Total Interest is $" + Math.round(totalInterest * 100) / 100);



        }
    }

}
