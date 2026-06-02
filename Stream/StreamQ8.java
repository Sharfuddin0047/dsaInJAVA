// From a list of employees, find the top 2 highest paid employees.

package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import Stream.Employee;

public class StreamQ8 {
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
                new Employee("Sumit", "Marketing", 52000)));

        List<Employee> emp  = employees.stream()
                .sorted((a, b) -> b.getSalary() - a.getSalary())
                .limit(2)
                .collect(Collectors.toList());
                
        System.out.println(emp);

    }
}
