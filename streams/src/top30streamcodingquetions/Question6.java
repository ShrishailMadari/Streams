package top30streamcodingquetions;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Question6 {
    public static void main(String[] args) {
        System.out.println("Given a list of strings, find the first string that starts with a particular letter using findFirst().");
        List<String> stringList = Arrays.asList("Samartha", "Sanvi", "Soubhagya", "Shakuntala", "Geeta");
        String string = stringList.stream().filter(x -> x.startsWith("S") && x.endsWith("ta")).findFirst().orElse("No Such Element");
        System.out.println(string);

        String stringName = stringList.stream().filter(str -> str.startsWith("S")).findFirst().get();
        System.out.println(stringName);

    }
}
