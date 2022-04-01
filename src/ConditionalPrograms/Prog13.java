package ConditionalPrograms;
//Write a Java program that reads an positive integer and count the number of digits
import java.util.*;
public class Prog13 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the numbers");
        int num = scan.nextInt();
        int count = 0;
        while (num != 0) {
            num = num / 10;
            count++;
        }
        System.out.println("the digits count : " + count);
    }
}
