package java8methods.filtermethod;

import java.util.Arrays;
import java.util.List;

public class FilterMethod {
    public static void main(String[] args) {
        System.out.println("Filter: used to get those elements who matches the give predicate conditions");
//        filter takes predicate FI:
//        it has test method which takes the single argument
//        returns boolean value
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 6, 3, 3, 5, 67, 7, 5);
        list.stream().filter(x -> x > 6).toList().forEach(System.out::println);
//        collecting to list
        List<Integer> integers = list.stream().filter(x -> x > 8).toList();
        System.out.println(integers);
//        collecting to array
        Object[] array = list.stream().filter(x -> x > 5).toArray();
        System.out.println(Arrays.toString(array));

    }
}
