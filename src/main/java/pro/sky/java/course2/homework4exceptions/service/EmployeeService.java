package pro.sky.java.course2.homework4exceptions.service;

import pro.sky.java.course2.homework4exceptions.exceptions.EmployeeExistException;
import pro.sky.java.course2.homework4exceptions.exceptions.EmployeeNotFoundException;

import java.util.Map;

public interface EmployeeService {

    void addToEmployeeList(String firstName, String lastName)throws EmployeeExistException;

    void removeEmployee(String firstName, String lastName) throws EmployeeNotFoundException;

    String findEmployee(String firstName, String lastName) throws EmployeeNotFoundException;

    Map<String, String> getEmployees();

}