package collectors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JoiningMethod {
    public static void main(String[] args) {
        System.out.println("Joining( ): "+" Concatenates the elements of the stream into a single String.");
        String collect = Stream.of("HariyeNamaha", "GovindayaNamaha", "KrishnayaNamaha", "ParabramhaneNamaha")
                .collect(Collectors.joining(","));
        System.out.println(collect);
    }
}
