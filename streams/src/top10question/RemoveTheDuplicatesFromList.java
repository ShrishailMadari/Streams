package top10question;

import java.util.Arrays;
import java.util.List;

public class RemoveTheDuplicatesFromList {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 5, 3, 2, 7, 8, 9, 4);
        long count = integers.stream().distinct().toList().stream().count();
        System.out.println(count);
        List<Integer> list = integers.stream().distinct().toList();
        System.out.println("after removing: "+list);

    }
}
