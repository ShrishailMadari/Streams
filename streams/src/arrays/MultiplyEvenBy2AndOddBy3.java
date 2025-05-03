package arrays;

import java.util.Arrays;
import java.util.List;

public class MultiplyEvenBy2AndOddBy3{
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> list = integerList.stream().map(num -> num % 2 == 0 ? num * 2 : num * 3).toList();
        System.out.println(list);
    }
}
