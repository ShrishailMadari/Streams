package employee;

import java.util.*;


public class SecondHighestSalary {
    static class Employee{
        Integer age;
        Double salary;
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

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            Employee employee = (Employee) o;
            return Objects.equals(age, employee.age) && Double.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(dept, employee.dept);
        }

        @Override
        public int hashCode() {
            return Objects.hash(age, salary, name, dept);
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
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
                new Employee(28, 55000, "Alice", "IT"),
                new Employee(35, 72000, "Bob", "HR"),
                new Employee(40, 85000, "Charlie", "Finance"),
                new Employee(29, 60000, "David", "IT"),
                new Employee(32, 70000, "Emma", "Marketing"),
                new Employee(27, 50000, "Frank", "IT"),
                new Employee(45, 90000, "Grace", "Finance"),
                new Employee(30, 65000, "Henry", "HR"),
                new Employee(33, 71000, "Ivy", "Sales"),
                new Employee(38, 78000, "Jack", "Operations"));

        System.out.println(employees + " ");

        System.out.println();
        findingSecondMostSalary(employees);
        System.out.println();
        System.out.println("Second Most Salary with dept and name: ");
        findEmpWithName(employees);
    }

    private static void findEmpWithName(List<Employee> employees) {
        employees.stream()
                .filter(employee -> employee.salary.equals(
                        employees.stream().map(Employee::getSalary)
                                .distinct()
                                .sorted(Comparator.reverseOrder())
                                .limit(2)
                                .skip(1)
                                .findFirst()
                                .orElse(null)
                ))
                .forEach(emp ->
                        System.out.println("Employee is: "+emp.getName()+", Salary Is: "+emp.getSalary()+", department is: " +emp.getDept()));
    }

    private static void findingSecondMostSalary(List<Employee> employees) {
        Double secondHighestSalary = employees.stream()
                .map(emp -> emp.salary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst().get();
        System.out.println(secondHighestSalary);

    }
}