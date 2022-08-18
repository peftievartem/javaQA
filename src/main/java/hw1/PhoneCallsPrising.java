package main.java.hw1;

import java.util.Scanner;

public class PhoneCallsPrising {
    public static void main(String[] args) {
        System.out.println("Enter first operator price");
        Scanner sc = new Scanner(System.in);
        String operator1Price = sc.nextLine();
        int operator1PriceInt = 0;
        try {
            operator1PriceInt = Integer.parseInt(operator1Price);
        } catch (NumberFormatException e) {
            System.out.println("Error parsing operator price. Operator price = 0");
        }

        System.out.println("Enter call duration");
        sc = new Scanner(System.in);
        String operator1Time = sc.nextLine();
        int operator1TimeInt = 0;
        try {
            operator1TimeInt = Integer.parseInt(operator1Time);
        } catch (NumberFormatException e) {
            System.out.println("Error parsing call duration. Call duration = 0");
        }

        System.out.println("Enter second operator price");
        sc = new Scanner(System.in);
        String operator2Price = sc.nextLine();
        int operator2PriceInt = 0;
        try {
            operator2PriceInt = Integer.parseInt(operator2Price);
        } catch (NumberFormatException e) {
            System.out.println("Error parsing operator price. Operator price = 0");
        }

        System.out.println("Enter call duration");
        sc = new Scanner(System.in);
        String operator2Time = sc.nextLine();
        int operator2TimeInt = 0;
        try {
            operator2TimeInt = Integer.parseInt(operator2Time);
        } catch (NumberFormatException e) {
            System.out.println("Error parsing call duration. Call duration = 0");
        }

        System.out.println("Enter third operator price");
        sc = new Scanner(System.in);
        String operator3Price = sc.nextLine();
        int operator3PriceInt = 0;
        try {
            operator3PriceInt = Integer.parseInt(operator3Price);
        } catch (NumberFormatException e) {
            System.out.println("Error parsing operator price. Operator price = 0");
        }

        System.out.println("Enter call duration");
        sc = new Scanner(System.in);
        String operator3Time = sc.nextLine();
        int operator3TimeInt = 0;
        try {
            operator3TimeInt = Integer.parseInt(operator3Time);
        } catch (NumberFormatException e) {
            System.out.println("Error parsing call duration. Call duration = 0");
        }


        System.out.println("\nFirst call price: " + getCallPrice(operator1PriceInt, operator1TimeInt));
        System.out.println("Second call price: " + getCallPrice(operator2PriceInt, operator2TimeInt));
        System.out.println("Third call price: " + getCallPrice(operator3PriceInt, operator3TimeInt));
        System.out.println("All calls price  = " + (getCallPrice(operator1PriceInt, operator1TimeInt) +
                getCallPrice(operator2PriceInt, operator2TimeInt) +
                getCallPrice(operator3PriceInt, operator3TimeInt)));
    }

    public static int getCallPrice(int price, int time){
        return price * time;
    }


}
