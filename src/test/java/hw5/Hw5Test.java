package hw5;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static hw5.Hw5.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Hw5Test {

    @Test
    void testGetBiggerNumFromArr(){
        assertEquals(getBiggerNumFromArr(null), null);

        int[] expected0 = {};
        assertEquals(getBiggerNumFromArr(expected0), null);

        int[] expected1 = {2, -3, 45, 12};
        assertEquals(getBiggerNumFromArr(expected1), 45);

//        int[] expected2 = {-2, -3, -45, -212};
//        assertEquals(getBiggerNumFromArr(expected2), -45);
    }

    @Test
    void testGetSumOfPositive(){
        assertEquals(getSumOfPositive(null), 0);

        int[] expected0 = {};
        assertEquals(getSumOfPositive(expected0), 0);

        int[] expected1 = {2, -3, 45, 12};
        assertEquals(getSumOfPositive(expected1), 59);

        int[] expected2 = {-2, -3, -45, -212};
        assertEquals(getSumOfPositive(expected2), 0);

//        int[] expected3 = {-22, -33, 45, -212};
//        assertEquals(getSumOfPositive(expected3), 0);
    }

    @Test
    void testGetAmountOfNegative(){
        assertEquals(getAmountOfNegative(null), 0);

        int[] expected0 = {};
        assertEquals(getAmountOfNegative(expected0), 0);

        int[] expected1 = {2, -3, 45, 12};
        assertEquals(getAmountOfNegative(expected1), 1);

        int[] expected2 = {32, -3, 45, 12};
        assertEquals(getAmountOfNegative(expected1), 4);
    }

    @Test
    void testGetEmployeesByDepartmentNumber(){
        List<Employee> empsEmpty = new ArrayList<>();

        List<Employee> emps1 = new ArrayList<>();
        emps1.add(new Employee("Max",1,2000));
        emps1.add(new Employee("Artem",4,2300));
        emps1.add(new Employee("Sergey",4,2500));
        emps1.add(new Employee("Anna",6,2400));


        assertEquals(getEmployeesByDepartmentNumber(null,null), empsEmpty);
        assertEquals(getEmployeesByDepartmentNumber(null,0), empsEmpty);

        assertEquals(getEmployeesByDepartmentNumber(emps1,2), empsEmpty);
//
//        List<Employee> emps1result1 = new ArrayList<>();
//        emps1result1.add(new Employee("Artem",4,2300));
//        emps1result1.add(new Employee("Sergey",4,2500));
//
//        assertEquals(getEmployeesByDepartmentNumber(emps1,4), emps1result1);
//
//        List<Employee> emps1result2 = new ArrayList<>();
//        emps1result2.add(new Employee("Artem",4,2300));
//
//        assertEquals(getEmployeesByDepartmentNumber(emps1,1), emps1result2);
//        assertEquals(getEmployeesByDepartmentNumber(emps1,1), empsEmpty);

    }


}
