package employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

class Employee{
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
public class NthLargestSalary {
    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(new Employee("ShriHari", 10000),
                new Employee("ShriGuru", 20000.2),
                new Employee("Govinda", 3000),
                new Employee("Vasudev", 40000),
                new Employee("Janardana", 80000),
                new Employee("Achyuta", 29000),
                new Employee("Upendray", 8000),
                new Employee("Narasimha", 9000),
                new Employee("vamanay", 20000),
                new Employee("Hariye", 6000),
                new Employee("Krishna", 29000),
                new Employee("Vasudev", 98000),
                new Employee("Govinda", 109000)
        );
        int n = 4;
        list.stream().map(Employee::getSalary).distinct().sorted(Comparator.reverseOrder()).skip(n-1).findFirst().ifPresentOrElse(
                salary -> System.out.println("The " + n + "th largest salary is: " + salary),
                () -> System.out.println("There are less than " + n + " distinct salaries.")
        );

//        list.stream().map(Employee::getSalary).distinct().sorted()

        // Using a custom comparator to sort the employees by salary in descending order

    }
}
