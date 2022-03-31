package BasicPrograms;
//Write a Java program that accepts an integer (n) and computes the value of n+nn+nnn
import java.util.*;
public class Prog14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the num n");
        int n = scan.nextInt();
        String s = Integer.toString(n);
        System.out.println(s + "+" +s+s+ "+" +s+s+s);
    }
}
