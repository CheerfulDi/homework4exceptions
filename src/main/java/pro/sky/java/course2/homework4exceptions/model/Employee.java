package pro.sky.java.course2.homework4exceptions.model;

import java.util.Objects;

import static java.lang.String.format;

public class Employee {

    private static int idCounter;
    private static final int MIN_DEPARTMENT = 1;
    private static final int MAX_DEPARTMENT = 5;

    private final String firstName;
    private final String lastName;
    private double salary;
    private int department;
    private int id;


    public Employee(String firstName, String lastName, double salary, int department) {
        idCounter++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
        this.department = department;
        this.id = getIdCounter();
    }

    public int getIdCounter() {
        return idCounter;
    }

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public int getDepartment() {
        return department;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(int newDepartment) {
        if (department >= MIN_DEPARTMENT && department <= MAX_DEPARTMENT) {
            department = newDepartment;
        } else {
            throw new IllegalArgumentException("В компании всего 5 департаментов. Пожалуйста, введите значение от 1 до 5.");
        }
    }

    @Override
    public String toString() {
        return "Сотрудник: " + firstName + " " + lastName + ". Зарплата: " + format("%.2f", salary) + ". Отдел: " + department + ".";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Double.compare(employee.salary, salary) == 0 && department == employee.department && id == employee.id && firstName.equals(employee.firstName) && lastName.equals(employee.lastName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(firstName, lastName, salary, department, id);
    }
}

//    @Override
//    public String toString() {
//        return "Сотрудник: " + getFirstName() + " " + getLastName();
//    }
//}
