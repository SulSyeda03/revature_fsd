package fsdrevature;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EMICalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double principal, rate , time , inst;

        System.out.println();
        System.out.println("*************");
        System.out.println("Welcome to EMI Calculator!");

        try {
            System.out.println("\n Enter principal amount: ");
            principal = sc.nextDouble();

            System.out.println(" Enter interest percent: ");
            rate = sc.nextDouble();
            rate = rate/1200;

            System.out.println(" Enter time in months: ");
            time = sc.nextDouble();

            double numerator = ( rate * Math.pow(( 1 + rate ), time));
            double denominator = (Math.pow(( 1 + rate ), time)) - 1 ;
            double emi = principal * ( numerator / denominator );
            double totalPayment = emi * time;
            double interest = totalPayment - principal;

            System.out.print("Monthly payment is $");
            System.out.printf("%.2f",emi );

            System.out.print("\nTotal Interest Payable for" + time + " months is $");
            System.out.printf("%.2f",interest );

            System.out.print("\nTotal payment for " + time + " months is $");
            System.out.printf("%.2f",totalPayment );
            System.out.println();
        }

        catch(java.util.InputMismatchException err) {

            System.out.println("No such entry, wrong input.");
            System.out.println("Thank You for choosing EMI Calculator, Visit Again!");
        }

        sc.close();
    }
}
