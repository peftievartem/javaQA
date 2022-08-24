package main.java.hw2;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Person {
    private String name;
    private LocalDate birthDate;

    Person(){
        birthDate = LocalDate.now();
    }

    Person(String name, LocalDate birthDate){
        this.name = name;
        this.birthDate = birthDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirthYear() {
        return birthDate;
    }

    public int getAge(){
        return Period.between(birthDate, LocalDate.now()).getYears();
    }

    public String toString(){
        return "Name:" +  this.name + " Birth year:" + this.birthDate.getYear();
    }

    public void changeName(String name){
        setName(name);
    }

    Person inputDataFromConsole(){
        Person p = new Person();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        p.setName(sc.nextLine());

        System.out.println("Enter Birth Year 2022-20-20:");
        p.setBirthDate(LocalDate.parse(sc.nextLine()));
        return p;
    }


}
