package strings;

import java.util.Arrays;
import java.util.Comparator;

public class FindTheWordWithMaxLength {
    public static void main(String[] args) {
        String sentence = "Im learning Streams api in java";
        String string = Arrays.stream(sentence.split(" "))
                .max(Comparator.comparing(String::length)).get();
        System.out.println(string);
        String str = Arrays.stream(sentence.split(" ")).max((w1, w2) -> Integer.compare(w1.length(), w2.length())).get();
        System.out.println(str);

//        Arrays.stream(sentence.split(" ")).sorted()
    }
}
