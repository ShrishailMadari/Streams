package strings;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertOneObjectToAnother {
    public static void main(String[] args) {
//        one obj to another obj
        List<Employee> employees = List.of(new Employee(1,"abc",20.09),
                new Employee(1,"abc",20.09),
                new Employee(2,"acd",22.09),
                new Employee(4,"abc",21.09));
        List<EmployeeDto> list = employees.stream().map(emp -> new EmployeeDto(emp.id, emp.name, emp.sal)).toList();
        for (EmployeeDto dto : list){
            System.out.println(dto);
        }
        System.out.println();

        //List to map
        Map<String, Employee> map = employees.stream()
                .collect(Collectors.toMap(Employee::getName, e -> new Employee(e.id, e.name, e.sal)
                        ,(exist,duplicate)->duplicate));
            map.forEach((key,val)-> System.out.println(key+": "+val));
    }
    static class EmployeeDto{
        int id;
        String name;
        double sal;

        public EmployeeDto(int id, String name, double sal) {
            this.id = id;
            this.name = name;
            this.sal = sal;
        }

        @Override
        public String toString() {
            return "EmployeeDto{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", sal=" + sal +
                    '}';
        }
    }
    static class Employee{
        int id;
        String name;
        double sal;

        @Override
        public String toString() {
            return "Employee{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", sal=" + sal +
                    '}';
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public double getSal() {
            return sal;
        }

        public void setSal(double sal) {
            this.sal = sal;
        }

        public Employee(int id, String name, double sal) {
            this.id = id;
            this.name = name;
            this.sal = sal;
        }
    }
}
