package collectors;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToMapMethod {
    public static void main(String[] args) {
        Map<String, Integer> collect = Stream.of("Govinda", "Krishna", "Madhava", "Vasudeva", "Gopala")
                .collect(Collectors.toMap(name -> name, String::length));
        collect.forEach((key,vale)->{
            System.out.println(key+": "+vale);
        });
    }
}
