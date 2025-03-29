package top10question;

import java.util.Arrays;
import java.util.List;

public class CountNoOfStringsStartWithSpecialChar {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Banana","Berry"+"Orange","Apple","Cherry","Coconut");
        long count = stringList.stream().filter(x->x.startsWith("C")).count();
        System.out.println("count is: "+count);
    }
}
