package top10question;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class PrintingTheAverage {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 6, 7, 8, 9, 5, 4, 32, 6, 86, 9);
        double asDouble = integers.stream().mapToDouble(Integer::doubleValue).average().getAsDouble();
        System.out.println(asDouble);
    }
}
