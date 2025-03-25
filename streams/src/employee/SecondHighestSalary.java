package employee;

import java.util.*;

class Employee{
    int age;
    double salary;
    String name;
    String dept;

    public Employee(int age, double salary, String name,String dept) {
        this.age = age;
        this.salary = salary;
        this.name = name;
        this.dept = dept;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                ", dept='" + dept + '\'' +
                '}';
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
public class SecondHighestSalary {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
        new Employee(28,55000,"Alice",  "IT"),
        new Employee( 35, 72000,"Bob", "HR"),
        new Employee( 40, 85000, "Charlie","Finance"),
        new Employee( 29, 60000,"David", "IT"),
        new Employee( 32, 70000,"Emma", "Marketing"),
        new Employee( 27, 50000,"Frank", "IT"),
        new Employee( 45, 90000,"Grace", "Finance"),
        new Employee( 30, 65000,"Henry", "HR"),
        new Employee( 33, 71000,"Ivy", "Sales"),
        new Employee( 38, 78000,"Jack", "Operations"));

        Double secondHighestSalary = employees.stream()
                .map(emp -> emp.salary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().get();
        System.out.println(secondHighestSalary);

    }
}