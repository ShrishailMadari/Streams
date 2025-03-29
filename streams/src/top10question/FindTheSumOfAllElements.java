package top10question;

import java.util.Arrays;
import java.util.List;

public class FindTheSumOfAllElements {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7);
        int sum = integerList.stream().mapToInt(Integer::intValue).sum();
        System.out.println("sum is :"+sum);

    }
}
