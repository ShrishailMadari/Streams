package strings;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ConvertListOfStringToMapWithLength {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("shrishail","madari","java","Developer","Developer");
        Map<String, Integer> collect = stringList.stream().collect(Collectors.toMap(string -> string, String::length, ((integer, integer2) -> integer2)
        ));
        System.out.println(collect);
    }
}
