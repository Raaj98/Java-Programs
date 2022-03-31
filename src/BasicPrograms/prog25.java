package BasicPrograms;
//Write a Java program to add two numbers without using any arithmetic operators
import java.util.*;
public class prog25 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number a");
        int a = scan.nextInt();
        System.out.println("enter the number b");
        int b = scan.nextInt();
        System.out.println("sum of two number :" +Math.addExact(a,b));
    }
}
