package hw8;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {

     /*   System.out.println("TASK 1 ---------------");

        Scanner sc = new Scanner(System.in);

        try {
            Integer firstArg = Integer.parseInt(sc.nextLine());
            Integer secondArg = Integer.parseInt(sc.nextLine());
            try {
                System.out.println("Square Rectangle: " + squareRectangle(firstArg, secondArg));
            }catch (ArithmeticException e){
                System.err.println(e);
            }
        } catch (NumberFormatException e) {
            System.err.println("Argument is not a digit");
        }*/

        System.out.println();
        System.out.println("TASK 2 ---------------");

        ArrayList<Plant> plants = new ArrayList<>();

        try {
            plants.add(new Plant(10, "blue", "food"));
        } catch (Exception e) {System.err.println(e);}
        try {
            plants.add(new Plant(10, "blue", "ert"));
        } catch (Exception e) {System.err.println(e);}
        try {
            plants.add(new Plant(10, "yellow", "prom"));
        } catch (Exception e) {System.err.println(e);}
        try {
            plants.add(new Plant(10, "red", "light"));
        } catch (Exception e) {System.err.println(e);}


        System.out.println("plants: " + plants);
    }

    public static int squareRectangle(int a, int b) throws ArithmeticException{
        if (a < 0 || b < 0){
            throw new ArithmeticException("Error counting square Rectangle. Argument < 0");
        }
        return a * b;
    }

}
