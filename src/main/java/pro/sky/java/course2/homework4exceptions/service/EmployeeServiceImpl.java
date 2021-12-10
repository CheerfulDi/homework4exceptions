package pro.sky.java.course2.homework4exceptions.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.homework4exceptions.exceptions.EmployeeExistException;
import pro.sky.java.course2.homework4exceptions.exceptions.EmployeeNotFoundException;
import pro.sky.java.course2.homework4exceptions.model.Employee;

import java.util.ArrayList;
import java.util.List;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    List<Employee> employeeList = new ArrayList<>();

    @Override
    public boolean addToEmployeeList(String firstName, String lastName) {
        Employee employee = new Employee(firstName, lastName);
        if (employeeList.contains(employee))  {
            throw new EmployeeExistException();
        }
        return employeeList.add(new Employee(firstName, lastName));
    }

        @Override
        public boolean removeFromEmployeeList (String firstName, String lastName){
            Employee employee = new Employee(firstName, lastName);
            if (employeeList.contains(employee))  {
                    return employeeList.remove(employee);
                }
                throw new EmployeeNotFoundException();
        }

        @Override
        public Employee findEmployeeInList (String firstName, String lastName) {
            Employee employee = new Employee(firstName, lastName);
            if (employeeList.contains(employee)) {
                    return employee;
                }
            throw new EmployeeNotFoundException();
        }

            @Override
            public List<Employee> getEmployeeList () {
                return employeeList;
            }



 }




