package java8methods.mapmethod;

import java.util.Arrays;
import java.util.List;

public class MapMethod {
    public static void main(String[] args) {
        /*
        * map Method Details:
map: takes FI Function<T, R>: which has method inside FI: R apply(T t)
Arguments:
Function<? super T, extends R> mapper
Return Type:
Stream<R>
* In simple words:
map takes a Function (which converts T → R)
*  and returns a new Stream<R> after applying the function to each element.
*/
//1)
        List<String> names = Arrays.asList("john", "doe", "jane");
        List<String> list = names.stream().map(String::toUpperCase).toList();
        System.out.println(list);
//2)
        List<String> list1 = names.stream().map(String::toLowerCase).toList();
        System.out.println(list1);

//3)
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> integers = numbers.stream().map(x -> x * x).toList();
        System.out.println(integers);
//4)
        List<String> strings =  Arrays.asList("ShriHari","ShriGuru","Shrimannarayana","Janardhana");
        List<Integer> len = strings.stream().map(String::length).toList();
        System.out.println(len);
    }
}
