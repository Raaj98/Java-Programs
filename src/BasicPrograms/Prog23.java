package BasicPrograms;
//Write a Java program to compute the square root of an given integer
import java.util.*;
public class Prog23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the integer");
        int n = scan.nextInt();
        System.out.println(Math.sqrt(n));
    }
}
