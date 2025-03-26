package arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ReturnTheDuplicates {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 2, 1, 4, 4, 6, 9, 8, 9);
        List<Integer> integerList = new HashSet<>(list).stream().toList();
        System.out.println(integerList);
        System.out.println("OR");
        List<Integer> integers = list.stream().distinct().toList();
        System.out.println(integers);

        Map<Integer, Long> collect = list.stream().collect(Collectors.groupingBy(n -> n, Collectors.counting()));
        System.out.println(collect);
        List<Integer> duplicates = collect.entrySet().stream().filter(num -> num.getValue() > 1)
                .map(Map.Entry::getKey).toList();
        System.out.println(duplicates);
    }
}
