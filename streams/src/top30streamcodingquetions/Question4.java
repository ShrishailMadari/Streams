package top30streamcodingquetions;

import java.util.stream.Stream;

public class Question4 {
    public static void main(String[] args) {
        System.out.println("Count the number of strings whose length > 5 in a list.");
        long count = Stream.of("ShriHari", "Shrimannarayana", "Govinda", "Krishna","Ravi").filter(x -> x.length() > 5).count();
        System.out.println(count);
    }
}
