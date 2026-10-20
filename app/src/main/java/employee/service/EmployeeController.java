package employee.service;

import org.springframework.web.bind.annotation.*;

@RestController
public class EmployeeController {

    private Employees employees = new Employees();

    @GetMapping("/employees")
    public Employees getEmployees() {
        return employees;
    }

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        employees.addEmployee(employee);
        return employee;
    }
}