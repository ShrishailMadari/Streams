package arrays;

import java.util.Arrays;
import java.util.Comparator;

import static java.util.Arrays.*;

public class SecondHighestNumber {
    public static void main(String[] args) {
        int[] arrays = {1,2,3,4,5,6,7,80,9};
        Integer firstMax = stream(arrays).boxed().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(firstMax);
        Integer integer = stream(arrays).boxed().distinct().sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
        System.out.println(integer);
    }
}
