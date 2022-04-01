package ConditionalPrograms;
//Write a Java program that accepts three numbers and check All numbers are equal or not
import java.util.*;
public class Prog14 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter num a");
        int a = scan.nextInt();
        System.out.println("enter num b");
        int b = scan.nextInt();
        System.out.println("enter num c");
        int c = scan.nextInt();
        if (a==b && a==c && b==c ){
            System.out.println("all numbers are equal");
        }else {
            System.out.println("all numbers are not equal");
        }
    }
}
