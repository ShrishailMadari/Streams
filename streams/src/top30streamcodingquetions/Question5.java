package top30streamcodingquetions;

import java.util.Arrays;
import java.util.List;

public class Question5 {
    public static void main(String[] args) {
        System.out.println("From a list of integers, remove duplicate elements using distinct() and return the new list.");
        List<Integer> integers = Arrays.asList(2,3,4,6,7,8,9,3,8,5,7,8,3,5,9,2,21);
        List<Integer> uniqueElements = integers.stream().distinct().toList();
        System.out.println(uniqueElements);
    }
}
