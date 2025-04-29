package arrays;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseArrayInPlace {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5,6,7};
        reverseTheArray(arr);
    }

    private static void reverseTheArray(int[] arr) {
        IntStream.range(0,arr.length/2).forEach(
                i->swapElements(i,arr)
        );
        System.out.println(Arrays.toString(arr));
    }


    private static void swapElements(int i,int[]arr) {
        int temp = arr[i];
        arr[i] = arr[arr.length-i-1];
        arr[arr.length-i-1] = temp;

    }

}
