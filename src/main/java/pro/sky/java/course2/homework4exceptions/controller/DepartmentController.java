//package pro.sky.java.course2.homework4exceptions.controller;
//
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RestController;
//import pro.sky.java.course2.homework4exceptions.model.Employee;
//import pro.sky.java.course2.homework4exceptions.service.DepartmentService;
//
//import java.util.Collection;
//
//@RestController
//@RequestMapping(path="/departments")
//public class DepartmentController {
//
//    private final DepartmentService departmentService;
//
//    public DepartmentController(DepartmentService departmentService) {
//        this.departmentService = departmentService;
//    }
//
//    @GetMapping(path = "/min-salary")
//    public Employee findMinSalaryEmployee(@RequestParam int department) {
//
//    }
//
//    @GetMapping(path = "/max-salary")
//    public Employee findMaxSalaryEmployee(@RequestParam int department) {
//
//    }
//
//    @GetMapping(path = "/all")
//    public Collection<Employee> getEmployeesByDepartment(@RequestParam int department) {
//
//    }
//
//    @GetMapping(path = "/all")
//    public Collection<Employee> getEmployeesByDepartment() {
//
//    }
//}
