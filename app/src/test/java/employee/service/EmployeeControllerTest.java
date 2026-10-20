package employee.service;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeControllerTest {

    @Test
    public void testEmployeeCreation() {

        Employee employee = new Employee(
                "Ansh",
                "Suryan",
                "E104",
                "ansh@example.com",
                "Developer"
        );

        assertEquals("Ansh", employee.getFirst_name());
        assertEquals("Suryan", employee.getLast_name());
        assertEquals("E104", employee.getEmployee_id());
        assertEquals("ansh@example.com", employee.getEmail());
        assertEquals("Developer", employee.getTitle());
    }

    @Test
    public void testEmployeeListNotEmpty() {

        Employees employees = new Employees();

        assertFalse(employees.getEmployees().isEmpty());
    }

    @Test
    public void testEmployeeCount() {

        Employees employees = new Employees();

        assertEquals(3, employees.getEmployees().size());
    }
}