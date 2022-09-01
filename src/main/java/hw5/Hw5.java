package hw5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Hw5 {

    public static void main(String[] args) {

        int arr[] = {3, -5, -43, 55, 21, -34, 33, 34, -73, 0};

        System.out.println("Bigger num is " + getBiggerNumFromArr(arr));
        System.out.println("Sum of positive is " + getSumOfPositive(arr));
        System.out.println("Amount of negative is " + getAmountOfNegative(arr));

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Max",1,2000));
        employees.add(new Employee("Artem",1,2300));
        employees.add(new Employee("Sergey",3,2500));
        employees.add(new Employee("Anna",3,2400));
        employees.add(new Employee("Olena",5,2200));

        System.out.println("\nSelect Department Number");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Integer depNum = Integer.parseInt(s);
        List<Employee> employeesResult = getEmployeesByDepartmentNumber(employees, depNum);
        if (!employeesResult.isEmpty()) {
            System.out.println("\nEmployees ------- ");
            for (Employee emp : employeesResult) {
                System.out.println(emp.getName() + ", " + emp.getDepartmentNumber() + ", " + emp.getSalary());
            }
        }else{
            System.out.println("No employees in this department");
        }

    }

    public static Integer getBiggerNumFromArr(int[] arr){
        if (arr != null && arr.length > 0) {
            Arrays.sort(arr);
            return arr[arr.length - 1];
        }
        return null;
    }

    public static int getSumOfPositive(int[] arr){
        int sum = 0;
        if (arr != null && arr.length > 0) {
            for (int num : arr) {
                if (num > 0) {
                    sum += num;
                }
            }
        }

        return sum;
    }

    public static int getAmountOfNegative(int[] arr){
        int amount = 0;
        if (arr != null && arr.length > 0) {
            for (int num : arr) {
                if (num < 0) {
                    amount++;
                }
            }
        }
        return amount;
    }

    public static List<Employee> getEmployeesByDepartmentNumber(List<Employee> emps, Integer depNum){
        List<Employee> employees = new ArrayList<>();
        if (emps != null && depNum != null && !emps.isEmpty()) {
            for (Employee emp : emps) {
                if (emp.getDepartmentNumber() == depNum) {
                    employees.add(emp);
                }
            }
        }
        return employees;
    }

}