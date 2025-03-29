package top10question;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SortingNumbers {
    public static void main(String[] args) {
        //Given array:
        List<Integer> integers = Arrays.asList(1, 2, 4, 5, 7, 8, 4, 2,25,6,8,14,88,3,19,2,7, 24, 5, 7);
        // sorted in ascending order
        List<Integer> integerList = integers.stream().sorted().toList();
        System.out.println("sorted list is: "+integerList);

        //sorting in reverse descending order
        List<Integer> reverseOrder = integers.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println("Reversed: "+reverseOrder);

        //removing the duplicates
        List<Integer> removedDuplicates = integers.stream().distinct().toList();
        System.out.println("Without duplicates: "+removedDuplicates);

        // finding max number:
        Integer maxNumber = integers.stream().max(Comparator.naturalOrder()).get();
        System.out.println("max number is: "+maxNumber);

        //minimum number
        Integer minNumber = integers.stream().min(Comparator.naturalOrder()).get();
        System.out.println("Min number is: "+ minNumber);

        // second max number
        //1st - approach:
        Integer secondMaxNumber = integers.stream().distinct().sorted((a, b) -> b - a).skip(1).findFirst().get();
        System.out.println("second max element: "+secondMaxNumber);

        //2nd - approach:
        Integer secondMax = integers.stream().distinct().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println("second max num: "+secondMax);

        // third max number
        // 1st approach:
        Integer thirdMax = integers.stream().distinct().sorted(Comparator.reverseOrder()).skip(2).findFirst().get();
        System.out.println("Third Max num: "+thirdMax);

        //2nd approach:
        Integer thirdMaxNumb = integers.stream().distinct().sorted((p, q) -> q - p).skip(2).findFirst().get();
        System.out.println("Third Max Num: "+thirdMaxNumb);

        // 2nd min number
        // 1st approach:
        Integer secondMinNum = integers.stream().distinct().sorted(Comparator.naturalOrder()).skip(1).findFirst().get();
        System.out.println("second min numb: "+ secondMinNum);

        // 2nd approach:
        Integer secMinNum = integers.stream().distinct().sorted((n, m) -> n - m).skip(1).findFirst().get();
        System.out.println("Second Min Num: "+ secMinNum);


        // third min:
        Integer thirdMin = integers.stream().distinct().sorted((n, m) -> n - m).skip(3).findFirst().get();
        System.out.println("Third Min Num: "+ thirdMin);

    }
}
