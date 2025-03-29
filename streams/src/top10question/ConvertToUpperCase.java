package top10question;

import java.util.Arrays;
import java.util.List;

public class ConvertToUpperCase {
    public static void main(String[] args) {
        List<String>  stringList = Arrays.asList("shrishail","madari");
        // printing with for each
        stringList.stream().map(String::toUpperCase).forEach(System.out::println);
        // printing with list
        List<String> list = stringList.stream().map(String::toUpperCase).toList();
        System.out.println("list is: "+list);
        List<String>  toLowerCase = Arrays.asList("SHRISAHIL","MADARI");
        List<String> lowerCase = toLowerCase.stream().map(String::toLowerCase).toList();
        System.out.println("List is: "+lowerCase);
    }

}
