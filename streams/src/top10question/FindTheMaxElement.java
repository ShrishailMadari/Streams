package top10question;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.OptionalInt;

public class FindTheMaxElement {
    public static void main(String[] args) {
        // using array
        int [] arr = {1,2,3,4,5,6,7,8,9};
        int asInt = Arrays.stream(arr).max().getAsInt();
        System.out.println("max number is: "+asInt);

        List<Integer> integerList = Arrays.asList(2,3,4,7,89,2);
        Integer integer = integerList.stream().max(Comparator.naturalOrder()).get();
        System.out.println("max element is: "+integer);
    }
}
