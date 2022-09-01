package hw2;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Person person1 = new Person();
        person1.setName("Artem");
        person1.setBirthDate(LocalDate.of(2000, 03, 23));

        Person person2 = new Person();
        Person p = person2.inputDataFromConsole();
        System.out.println(p.toString());

        Person person3 = new Person("Max", LocalDate.of(2000, 03, 23));

        Person person4 = new Person("Carl", LocalDate.of(2000, 03, 23));

        Person person5 = new Person("Bill", LocalDate.of(2000, 03, 23));
        System.out.println(person5.toString());
    }
}
