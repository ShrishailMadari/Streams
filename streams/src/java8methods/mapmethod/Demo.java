package java8methods.mapmethod;

import java.util.Arrays;
import java.util.List;

public class Demo {
    static class Employee {
        private String name;
        private int age;

        // constructor, getters
        public Employee(String name, int age) {
            this.name = name;
            this.age = age;
        }
        public Employee(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }

    public static void main(String[] args) {
        List<Employee> list = Arrays.asList(new Employee("hari", 99),
                new Employee("Shriguru", 87),
                new Employee("Krishna", 54),
                new Employee("Damodhara", 34),
                new Employee("Govinda", 59)
        );
        List<String> nameList = list.stream().map(Employee::getName).toList();
        System.out.println(nameList);

        List<Integer> ageList = list.stream().map(Employee::getAge).toList();
        System.out.println(ageList);

        List<String> stringList = Arrays.asList("Hari", "Govinda", "Krishan", "Vasudeva");
        List<Employee> newEmpList = stringList.stream().map(Employee::new).toList();
        newEmpList.forEach(str-> System.out.println(str.getName()));

    }

}
