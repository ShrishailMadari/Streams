package strings;

import java.util.Arrays;

public class RemoveDuplicatesFmStringReturnWordInSameOrder {
    public static void main(String[] args) {
        String word = "abcdbdce";
        Arrays.stream(word.split("")).distinct().forEach(System.out::print);
    }
}
