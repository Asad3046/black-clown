package methodreference;

import java.util.*;
import java.util.stream.Collectors;

public class GroupingDemo {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Omer", 25),
            new Employee("Asad", 30),
            new Employee("Wasif", 25),
            new Employee("Hanzala", 30),
            new Employee("Ali", 35)
        );

        // Group employees by their age
        Map<Integer, List<Employee>> groupedByAge = employees.stream()
            .collect(Collectors.groupingBy(Employee::getAge));  // Method Reference here!

        // Print the groups
        for (Map.Entry<Integer, List<Employee>> entry : groupedByAge.entrySet()) {
            System.out.println("Age: " + entry.getKey());
            for (Employee e : entry.getValue()) {
                e.display();
            }
            System.out.println("-----");
        }
    }
}
