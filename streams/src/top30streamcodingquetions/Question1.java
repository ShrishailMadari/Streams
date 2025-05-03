package top30streamcodingquetions;

import java.util.Arrays;
import java.util.List;

public class Question1 {
    public static void main(String[] args) {
        System.out.println("1. Find all even numbers from a list and return a list of even numbers using Streams.");
        List<Integer> numbers = Arrays.asList(1, 4, 5, 8, 10, 13, 17, 20);

        List<Integer> evenNumbers = numbers.stream()
                .filter(num -> num % 2 == 0) // keep only even numbers
                .toList(); // collect into a list

        System.out.println("Even Numbers: " + evenNumbers);

        List<Integer> oddNumbers = numbers.stream().map(x -> x % 2 == 0 ? x*3:x*4 ).toList();
        System.out.println("Odd Numbers: " + oddNumbers);


    }

}
