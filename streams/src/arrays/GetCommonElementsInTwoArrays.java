package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class GetCommonElementsInTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3,4,5,6};
        int[] arr2 = {4,5,6,7,8,3};
        findCommonElement(arr1,arr2);
    }

    private static void findCommonElement(int[] arr1, int[] arr2) {
        List<Integer> integers = Arrays.stream(arr1).filter(num1 -> Arrays.stream(arr2).anyMatch(num2 -> num2 == num1)).boxed().toList();
        System.out.println(integers);
    }
}
