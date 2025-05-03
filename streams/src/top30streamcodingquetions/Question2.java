package top30streamcodingquetions;

import java.util.Arrays;
import java.util.List;

public class Question2 {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Shrishail", "Shrigur", "Shridhara", "Shrimannarayana");
        List<String> list = stringList.stream().map(String::toLowerCase).toList();
        System.out.println(list);
//        or
        stringList.stream().map(String::toUpperCase).forEach(System.out::println);


    }
}
