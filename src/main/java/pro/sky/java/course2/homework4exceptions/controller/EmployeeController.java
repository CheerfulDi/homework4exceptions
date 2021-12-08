package pro.sky.java.course2.homework4exceptions.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pro.sky.java.course2.homework4exceptions.model.Employee;
import pro.sky.java.course2.homework4exceptions.service.EmployeeService;

import java.util.List;


@RestController
@RequestMapping(path="/employee")

public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping(path = "/add/employee-list")
    public String addToEmployeeList(@RequestParam String employee) {
        employeeService.addToEmployeeList(employee);
        return "Сотрудник " + employee + " успешно создан.";
    }

    @GetMapping(path = "/remove/employee-list")
    public String removeFromEmployeeList(@RequestParam String employee) {
        employeeService.removeFromEmployeeList(employee);
        return "Сотрудник удалён.";
    }

    @GetMapping(path = "/get/employee-list")
    public List<String> getEmployeeList() {
        return employeeService.getEmployeeList();
    }

//    @GetMapping(path = "/find")
//    public String find(@RequestParam String employee) {
//        return employeeService.findEmployeeInList(employee);
//    }

}