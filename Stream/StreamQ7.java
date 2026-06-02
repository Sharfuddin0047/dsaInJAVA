// from a list of employees, find the first employee whose salary is greater than 50000
package Stream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import Stream.Employee;

public class StreamQ7 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(Arrays.asList(
            new Employee("Abhishek", "IT", 50000),
            new Employee("Ankit", "IT", 70000),
            new Employee("Rahul", "HR", 40000),
            new Employee("Tina", "HR", 45000),
            new Employee("Esha", "Finance", 60000),
            new Employee("Naman", "Finance", 55000),
            new Employee("Sachit", "IT", 80000),
            new Employee("Pushp", "Marketing", 50000),
            new Employee("Sumit", "Marketing", 52000)
        ));

        Optional<Employee> emp = employees.stream()
            .filter(x -> x.getSalary() > 50000)
            .findFirst();

        if(emp.isPresent()) {
            System.out.println(emp.get());
        }
        
    }
}
