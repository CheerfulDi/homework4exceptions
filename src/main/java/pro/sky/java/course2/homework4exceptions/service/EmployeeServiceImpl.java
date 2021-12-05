package pro.sky.java.course2.homework4exceptions.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.homework4exceptions.exceptions.EmployeeBookOverFlowException;
import pro.sky.java.course2.homework4exceptions.exceptions.EmployeeNotFoundException;
import pro.sky.java.course2.homework4exceptions.model.Employee;


@Service
public class EmployeeServiceImpl implements EmployeeService {

    Employee[] employees = new Employee[2];


    @Override
    public boolean addEmployee(String firstName, String lastName) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] == null) {
                employees[i] = new Employee(firstName, lastName);
                return true;
            }
        }
        throw new EmployeeBookOverFlowException();
    }


    @Override
    public boolean dismissEmployee(String firstName, String lastName) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null
                    && employees[i].getFirstName().equals(firstName)
                    && employees[i].getLastName().equals(lastName)) {
                employees[i] = null;
                return true;
            }
        }
        throw new EmployeeBookOverFlowException();
    }

        public Employee findEmployee(String firstName, String lastName){
            for (Employee employee : employees) {
                if (employee != null
                        && employee.getFirstName().equals(firstName)
                        && employee.getLastName().equals(lastName)) {
                    return employee;
                }
            }
            throw new EmployeeNotFoundException();
        }
    }




