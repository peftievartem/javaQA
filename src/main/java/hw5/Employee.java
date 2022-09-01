package hw5;

public class Employee {
    private String name;
    private int departmentNumber;
    private float salary;

    Employee() {}

    Employee(String name, int departmentNumber, float salary) {
        this.name = name;
        this.departmentNumber = departmentNumber;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public float getSalary() {
        return salary;
    }

    public int getDepartmentNumber() {
        return departmentNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDepartmentNumber(int departmentNumber) {
        this.departmentNumber = departmentNumber;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
