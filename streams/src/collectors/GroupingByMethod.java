package collectors;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupingByMethod {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ShriHari", "ShriMannarayana", "Govinda", "Krishnaya", "Narasimhaya");
        System.out.println(list);

        Map<Integer, List<String>> collect =
                list.stream().collect(Collectors.groupingBy(String::length));
        collect.keySet().forEach(System.out::print);

    }
}
