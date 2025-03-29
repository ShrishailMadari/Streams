package strings;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ReturnCharacterWithTheMaximumFrequency {
    public static void main(String[] args) {
        String word = "ShrishailMadari";
        Map<IntStream, Long> collect = Arrays.stream(word.split(" ")).collect(Collectors
                .groupingBy(String::chars, Collectors.counting()));
        System.out.println(collect);
    }
}
