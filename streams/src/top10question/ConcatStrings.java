package top10question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConcatStrings {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Ravi", "is", "on", "the", "road");
        String collect = list.stream().collect(Collectors.joining(","));
        System.out.println(collect);


    }
}
