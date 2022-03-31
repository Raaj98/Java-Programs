package BasicPrograms;
//Write a Java program to convert a decimal number to binary numbers
import java.util.*;
public class Prog7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter decimal number");
        int a = scan.nextInt();
        System.out.println("the binary number ");
        System.out.println(Integer.toBinaryString(a));
    }
}
