package strings;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class FindTheLongestWordLength {
    public static void main(String[] args) {
        String[] strings = {"Banana","Apple","Orange","Grapes","pineApple","Shrimannarayana"};
        longestWordLength(strings);
        System.out.println("Finding Minimum: ");
        smallestWordLength(strings);
        findTheWordWithLength(strings);
    }

    private static void findTheWordWithLength(String[] strings) {
        Map<Integer, List<String>> collect = Arrays.stream(strings).collect(Collectors.groupingBy(String::length));
        System.out.println(collect);
    }

    private static void smallestWordLength(String[] strings) {

        List<Integer> integers = Arrays.stream(strings).map(String::length).toList();
        Integer integer = integers.stream().min(Comparator.naturalOrder()).get();
        System.out.println(integer);
        System.out.println("Other Way :");
        int minNumber = Arrays.stream(strings).mapToInt(String::length).min().orElseThrow();
        System.out.println(minNumber);

    }

    private static void longestWordLength(String[] strings) {

        Integer integer1 = Arrays.stream(strings).map(String::length).toList().stream().max(Comparator.naturalOrder()).get();
        System.out.println(integer1);
        System.out.println("******************************************");
        Integer integer = Arrays.stream(strings).mapToInt(String::length).max().getAsInt();
        System.out.println(integer);

    }
}
