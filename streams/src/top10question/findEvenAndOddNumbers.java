package top10question;

import java.util.Arrays;
import java.util.List;

public class findEvenAndOddNumbers {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        System.out.println("Printing Even: ");
        List<Integer> evenList = list.stream().filter(x -> x % 2 == 0).toList();

        System.out.println("even: "+evenList);
        System.out.println("Printing Odd: ");
        List<Integer> oddList = list.stream().filter(x -> x % 2 != 0).toList();
        System.out.println("odd: "+oddList);
        System.out.println("\"Shrishail\""+" "+"\"Madari\"");
        List<Integer> integers = list.stream().map(x -> x % 2 == 0 ? x*2 : x*3).toList();
        System.out.println(integers);

        long count = list.stream().filter(x -> x % 2 == 0).count();
        System.out.println("even count is:"+count);




    }
}
