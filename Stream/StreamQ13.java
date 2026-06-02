// Given a list of employees, find the average salary of employees in each department

package Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import Stream.Employee;

public class StreamQ13 {
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

        Map<String, Double> result = employees.stream()
                .collect(Collectors.groupingBy(
                        emp -> emp.getDepartment(), Collectors.averagingInt(emp -> emp.getSalary())));

        System.out.println(result);
    }
}
