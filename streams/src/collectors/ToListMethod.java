package collectors;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ToListMethod {
    public static void main(String[] args) {
        Stream.of("Alice", "Bob", "Charlie").toList().forEach(x->{
            System.out.print(x.length()+" ");
            System.out.println();
        });

        List<String> namesList = Stream.of("Alice", "Bob", "Charlie").toList();
        System.out.println(namesList);
        System.out.println();
        System.out.println("************************************");
        List<String> list = Stream.of("Alice", "Bob", "Charlie").toList();/*.forEach(x->{
            System.out.print(x.length()+" ");*/
        System.out.println(list);

    }

}
