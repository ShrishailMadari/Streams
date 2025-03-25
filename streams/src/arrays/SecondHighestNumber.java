package arrays;

import java.util.Arrays;
import java.util.Optional;

public class SecondHighestNumber {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5,6,7,80,9};
        Integer integer = Arrays.stream(arrays).boxed().distinct().sorted((a, b) -> b - a).skip(1).findFirst().get();
        System.out.println(integer);
    }
}
