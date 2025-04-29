package employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class FirstHighestSalary {
    static class Employee{
        int id;
        String Name;
        double salary;
        String dept;

        public Employee(int id, String name, double salary, String dept) {
            this.id = id;
            Name = name;
            this.salary = salary;
            this.dept = dept;
        }

        @Override
        public String toString() {
            return "Employee { " +'\n'+
                    "id= " + id + '\n'+
                    "Name= " + Name + '\n' +
                    "salary= " + salary +'\n'+
                    "dept= " + dept +
                    " }";
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return Name;
        }

        public void setName(String name) {
            Name = name;
        }

        public double getSalary() {
            return salary;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }

        public String getDept() {
            return dept;
        }

        public void setDept(String dept) {
            this.dept = dept;
        }
    }
    public static void main(String[] args) {
        List<Employee> employeeList = Arrays.asList(
                new Employee(100,"Hari",9.90,"kind"),
                new Employee(200,"krishna",99.90,"kind"),
                new Employee(300,"vasudeva",999.90,"kind"),
                new Employee(400,"janardhana",9999.90,"kind"),
                new Employee(500,"Achyuta",19.90,"kind"),
                new Employee(600,"om",199.90,"kind"),
                new Employee(700,"Harree",29992.90,"kind"),
                new Employee(800,"narayana",19999.90,"kind"),
                new Employee(900,"narasimhaya",90.90,"kind"),
                new Employee(1000,"madhava",299.90,"kind"),
                new Employee(110,"madhusoodhana",39.90,"kind"),
                new Employee(120,"govind",79.90,"kind")
        );

        System.out.println();
        System.out.println("Finding First Highest Salary: ");
        findFirstHighestSalary(employeeList);
        System.out.println();
        System.out.println("Getting Employee who's With Second Most Salary");
        findingSecondHighestSalary(employeeList);
        System.out.println();
        System.out.println("Finding the third highest Salary:");
        findingThirdHighestSalary(employeeList);
        System.out.println();
        System.out.println("Finding the Employee Whose salary is greater than {N} ");
        findingEmpWhoseSalIsGreaterThanN(employeeList);
    }

    private static void findingThirdHighestSalary(List<Employee> employeeList) {
        Double thirdHighestSalary = employeeList.stream().map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .limit(3)
                .skip(2)
                .findFirst()
                .get();
        System.out.println(thirdHighestSalary);
    }


    private static void findFirstHighestSalary(List<Employee> employeeList) {
        Double firstHighest = employeeList.stream().map(emp -> emp.salary).max(Comparator.naturalOrder()).get();
        System.out.println(firstHighest);
    }

    private static void findingSecondHighestSalary(List<Employee> employeeList) {
        Double secondHighestSalary = employeeList.stream()
                .map(Employee::getSalary)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .skip(1)
                .findFirst().get();
        System.out.println("Second Highest Salary: "+secondHighestSalary);
    }

    private static void findingEmpWhoseSalIsGreaterThanN(List<Employee> employeeList) {
        List<Employee> list = employeeList.stream().filter(emp -> emp.getSalary() > 2000).toList();
        System.out.print(list+"  ");
    }
}
