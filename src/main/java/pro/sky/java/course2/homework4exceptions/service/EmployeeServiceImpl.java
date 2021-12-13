package pro.sky.java.course2.homework4exceptions.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.homework4exceptions.exceptions.EmployeeExistException;
import pro.sky.java.course2.homework4exceptions.exceptions.EmployeeNotFoundException;
import pro.sky.java.course2.homework4exceptions.model.Employee;

import java.util.HashMap;
import java.util.Map;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    Map<String, String> employees = new HashMap<>();

    @Override
    public void addToEmployeeList(String firstName, String lastName) {
        if (employees.containsKey(lastName) && employees.containsValue(lastName)) {
            throw new EmployeeExistException();
        } else {
            employees.put(firstName, lastName);
        }
    }

    @Override
    public void removeEmployee (String firstName, String lastName) {
        if (employees.containsKey(lastName) && employees.containsValue(lastName)) {
            employees.remove(lastName);
        } else {
            throw new EmployeeNotFoundException();
        }
    }

    @Override
    public String findEmployee (String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employees.containsKey(lastName) && employees.containsValue(lastName)) {
            return employees.get(employee);
        } else {
            throw new EmployeeNotFoundException();
        }
    }

    @Override
    public Map<String, String> getEmployees() {
        return employees;
    }

}
