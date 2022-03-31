package BasicPrograms;
//Write a Java program to swap the first and last elements of an array and create a new array
import java.util.Arrays;
public class Prog21 {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};
        System.out.println(arr.length);
        System.out.println(Arrays.toString(arr));
        swapElements(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void swapElements(int[] arr) {
        int tmp = arr[0];
        arr[0] = arr[3];
        arr[3] = tmp;
    }
}
