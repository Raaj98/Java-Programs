package BasicPrograms;
//Write a Java program that takes two numbers and display the product of two numbers
import java.util.*;
public class Prog3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter a");
        int a = scan.nextInt();
        System.out.println("enter b");
        int b = scan.nextInt();
        System.out.println("product of two numbers:" + a + "*" + b + "=" + (a*b));
    }
}
