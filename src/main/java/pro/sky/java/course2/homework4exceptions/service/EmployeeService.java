package pro.sky.java.course2.homework4exceptions.service;

import pro.sky.java.course2.homework4exceptions.exceptions.EmployeeBookOverFlowException;
import pro.sky.java.course2.homework4exceptions.exceptions.EmployeeNotFoundException;

import java.util.List;

public interface EmployeeService {

    boolean addToEmployeeList(String employee)throws EmployeeBookOverFlowException;

    boolean removeFromEmployeeList(String employee) throws EmployeeNotFoundException;

//    String findEmployeeInList(String employee) throws EmployeeNotFoundException;

    List<String> getEmployeeList();
}
