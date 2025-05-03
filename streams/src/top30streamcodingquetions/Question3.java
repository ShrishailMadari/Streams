package top30streamcodingquetions;

import java.util.Arrays;
import java.util.List;

public class Question3 {
    public static void main(String[] args) {
        System.out.println("Given a list of integers, square each number and return a new list.");

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> integersList = integers.stream().map(x -> x * 2).toList();
        System.out.println(integersList);
    }
}
