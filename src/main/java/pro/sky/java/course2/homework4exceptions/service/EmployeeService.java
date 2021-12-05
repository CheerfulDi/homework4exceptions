package pro.sky.java.course2.homework4exceptions.service;

import pro.sky.java.course2.homework4exceptions.model.Employee;

public interface EmployeeService {

    boolean addEmployee(String firstName, String lastName);

    Employee findEmployee(String firstName, String lastName);

    boolean dismissEmployee(String firstName, String lastName);
}
