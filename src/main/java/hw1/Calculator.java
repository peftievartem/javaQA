package hw1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Enter first argument");
        Scanner sc = new Scanner(System.in);
        String firstArg = sc.nextLine();

        int firstArgInt = 0;
        try {
            firstArgInt = Integer.parseInt(firstArg);
        } catch (NumberFormatException e) {
            System.out.println("Error parsing first argument. First argument = 0");
        }

        System.out.println("Enter second argument");
        sc = new Scanner(System.in);
        String secondArg = sc.nextLine();

        int secondArgInt = 0;
        try {
            secondArgInt = Integer.parseInt(secondArg);
        } catch (NumberFormatException e) {
            System.out.println("Error parsing second argument. Second argument = 0");
        }

        System.out.println("\nArguments: " + firstArgInt + " and " + secondArgInt);
        System.out.println("Sum = " + sum(firstArgInt, secondArgInt));
        System.out.println("Subtract = " + subtract(firstArgInt, secondArgInt));
        System.out.println("Multiply = " + multiply(firstArgInt, secondArgInt));
        Integer divValue = null;
        if (division(firstArgInt, secondArgInt) != null){
            System.out.println("Division = " + division(firstArgInt, secondArgInt));
        }else{
            System.out.println("Division = division by zero");
        }
    }

    public static int sum(int a, int b){
        return a + b;
    }

    public static int subtract(int a, int b){
        return a - b;
    }

    public static int multiply(int a, int b){
        return a * b;
    }

    public static Integer division(int a, int b){
        try {
            return a / b;
        } catch (ArithmeticException e) {
            return null;
        }
    }

}
