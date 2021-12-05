package pro.sky.java.course2.homework4exceptions.service;

import pro.sky.java.course2.homework4exceptions.exceptions.EmployeeBookOverFlowException;
import pro.sky.java.course2.homework4exceptions.exceptions.EmployeeNotFoundException;
import pro.sky.java.course2.homework4exceptions.model.Employee;

public interface EmployeeService {

    boolean addEmployee(String firstName, String lastName)throws EmployeeBookOverFlowException;

    Employee findEmployee(String firstName, String lastName) throws EmployeeNotFoundException;

    boolean dismissEmployee(String firstName, String lastName) throws EmployeeNotFoundException;
}
