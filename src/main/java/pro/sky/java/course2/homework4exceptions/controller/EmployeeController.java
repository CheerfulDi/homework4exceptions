package pro.sky.java.course2.homework4exceptions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.homework4exceptions.model.Employee;
import pro.sky.java.course2.homework4exceptions.service.EmployeeService;


@RestController
@RequestMapping(path="/employee")

public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/add")
    public String add(@RequestParam String firstName, @RequestParam String lastName) {
        employeeService.addEmployee(firstName, lastName);
        return "Сотрудник " + firstName + " " + lastName + " успешно создан.";
    }

    @GetMapping(path = "/remove")
    public String remove(@RequestParam String firstName, @RequestParam String lastName) {
        employeeService.dismissEmployee(firstName, lastName);
        return "Сотрудник " + firstName + " " + lastName + " удалён.";
    }

    @GetMapping(path = "/find")
    public Employee find(@RequestParam String firstName, @RequestParam String lastName) {
        return employeeService.findEmployee(firstName, lastName);
    }
}