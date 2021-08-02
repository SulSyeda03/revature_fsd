package fsdrevature;

import java.util.Scanner;

class Calculator{

    public static void addNumber(int num1, int num2){
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + (num1 + num2));
        System.out.println();
    }
    public static void subNumber(int num1, int num2){
        System.out.println("The difference of " + num1 + " and " + num2 + " is " + (num1 - num2));
        System.out.println();
    }
    public static void mulNumber(int num1, int num2){
        System.out.println("The multiplication of " + num1 + " and " + num2 + " is " + (num1 * num2));
        System.out.println();
    }
    public static void divNumber(int num1, int num2){
        System.out.println("The division of " + num1 + " and " + num2 + " is " + (num1 / num2));
        System.out.println();
    }
}

public class Runner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int menuSelection =0;
        System.out.println();
        System.out.println("************************************************");
        System.out.println(" Welcome to Calculator App ");
        System.out.println();
        System.out.println("Enter the two integers to perform calculation: ");
        int a = sc.nextInt();
        int b = sc.nextInt();

        try {

            while (menuSelection != 5) {

                System.out.println("Select the number to perform operation: ");
                System.out.println(" 1. Addition\n 2. Subtraction\n " +
                        "3. Multiplication\n 4. Division\n");

                menuSelection = sc.nextInt();

                switch (menuSelection) {

                    case 1:
                        Calculator.addNumber(a, b);
                        break;

                    case 2:
                        Calculator.subNumber(a, b);
                        break;

                    case 3:
                        Calculator.mulNumber(a, b);
                        break;

                    case 4:
                        Calculator.divNumber(a, b);
                        break;

                    default:
                        System.out.println("Thank You for choosing Calculator App, Visit Again!");
                        break;
                }
            }
        }
        catch(java.util.InputMismatchException err) {

            System.out.println("No such entry, wrong input.");
            System.out.println("Thank You for choosing Calculator App, Visit Again!");
        }
        sc.close();
    }
}
