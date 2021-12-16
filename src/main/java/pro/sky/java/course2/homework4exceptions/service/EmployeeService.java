package pro.sky.java.course2.homework4exceptions.service;

import pro.sky.java.course2.homework4exceptions.exceptions.EmployeeExistException;
import pro.sky.java.course2.homework4exceptions.exceptions.EmployeeNotFoundException;
import pro.sky.java.course2.homework4exceptions.model.Employee;

import java.util.Collection;

public interface EmployeeService {

    void addToEmployeeList(String firstName, String lastName)throws EmployeeExistException;

    void removeEmployee(String firstName, String lastName) throws EmployeeNotFoundException;

    Employee findEmployee(String firstName, String lastName) throws EmployeeNotFoundException;

    Collection<Employee> getEmployees();

}