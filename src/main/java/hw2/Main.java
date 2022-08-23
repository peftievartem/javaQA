package main.java.hw2;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setName("Artem");
        person1.setBirthYear(1984);

        Person person2 = new Person();
        person2.inputData();
        System.out.println(person2.toString());

        Person person3 = new Person("Max", 1961);

        Person person4 = new Person("Carl", 1975);

        Person person5 = new Person("Bill", 1922);
        System.out.println(person5.toString());
    }
}
