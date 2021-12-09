package pro.sky.java.course2.homework4exceptions.service;

import pro.sky.java.course2.homework4exceptions.exceptions.EmployeeExistException;
import pro.sky.java.course2.homework4exceptions.exceptions.EmployeeNotFoundException;
import pro.sky.java.course2.homework4exceptions.model.Employee;

import java.util.List;

public interface EmployeeService {

    boolean addToEmployeeList(String firstName, String lastName)throws EmployeeExistException;

    boolean removeFromEmployeeList(String firstName, String lastName) throws EmployeeNotFoundException;

    Employee findEmployeeInList(String firstName, String lastName) throws EmployeeNotFoundException;

    List<Employee> getEmployeeList();

    boolean checkEmployeeExist(String firstName, String lastName);

}
