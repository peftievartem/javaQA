package main.java.hw2;

import java.time.LocalDate;
import java.util.Scanner;

public class Person {
    private String name;
    private int birthYear;

    Person(){}

    Person(String name, int birthYear){
        this.name = name;
        this.birthYear = birthYear;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }

    public String getName() {
        return name;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public int getAge(){
        int years = LocalDate.now().getYear() - this.birthYear;
        if (years > 0) {
            return years;
        }else{
            return 0;
        }
    }

    public String toString(){
        return "Name:" +  this.name + " Birth year:" + this.birthYear;
    }

    void inputData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        sc = new Scanner(System.in);
        this.name = sc.nextLine();

        System.out.println("Enter Birth Year:");
        this.birthYear = Integer.parseInt(sc.nextLine());
    }

    public void changeName(String name){
        setName(name);
    }


}
