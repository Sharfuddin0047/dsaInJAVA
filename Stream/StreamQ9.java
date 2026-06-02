// From a list of employees, sort employees by salary then by name

package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import Stream.Employee;

public class StreamQ9 {
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
                .sorted(Comparator.comparingInt(Employee::getSalary)
                .thenComparing(Employee::getName))
                .collect(Collectors.toList());
                
        emp.forEach(System.out::println);
    }
}
