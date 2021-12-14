package pro.sky.java.course2.homework4exceptions.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.homework4exceptions.exceptions.EmployeeExistException;
import pro.sky.java.course2.homework4exceptions.exceptions.EmployeeNotFoundException;
import pro.sky.java.course2.homework4exceptions.model.Employee;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    Map<String, Employee> employees = new HashMap<>();

    @Override
    public void addToEmployeeList(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employees.containsKey(firstName+lastName)) {
            throw new EmployeeExistException();
        } else employees.put(firstName+lastName, employee);
    }

    @Override
    public void removeEmployee (String firstName, String lastName) {
        if (employees.containsKey(firstName+lastName)) {
            employees.remove(firstName+lastName);
        } else {
            throw new EmployeeNotFoundException();
        }
    }

    @Override
    public Employee findEmployee (String firstName, String lastName) {
        if (employees.containsKey(firstName+lastName)) {
           return employees.get(firstName+lastName);
        } else {
            throw new EmployeeNotFoundException();
        }
    }

    @Override
    public Collection<Employee> getEmployees() {
        return employees.values();
    }

}
