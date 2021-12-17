package pro.sky.java.course2.homework4exceptions.service;

import pro.sky.java.course2.homework4exceptions.model.Employee;

import java.util.Collection;

public interface DepartmentService {

    Employee findMinSalaryEmployee(int department);
    Employee findMaxSalaryEmployee(int department);
    Collection<Employee> getEmployeesByDepartment(int department);
    Collection<Employee> getAllEmployees();

}
