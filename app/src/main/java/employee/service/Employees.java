package employee.service;

import java.util.ArrayList;
import java.util.List;

public class Employees {

    private List<Employee> employees = new ArrayList<>();

    public Employees() {

        employees.add(new Employee(
                "Rahul", "Sharma", "E101",
                "rahul@example.com", "Software Engineer"
        ));

        employees.add(new Employee(
                "Priya", "Verma", "E102",
                "priya@example.com", "Backend Developer"
        ));

        employees.add(new Employee(
                "Amit", "Kumar", "E103",
                "amit@example.com", "Java Developer"
        ));
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }
}