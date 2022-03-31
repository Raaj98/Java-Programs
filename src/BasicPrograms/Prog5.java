package BasicPrograms;
//Write a Java program that takes five numbers as input to calculate and print the average of the numbers
import java.util.*;
public class Prog5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter num a");
        int a = scan.nextInt();
        System.out.println("enter num b");
        int b = scan.nextInt();
        System.out.println("enter num c");
        int c = scan.nextInt();
        System.out.println("enter num d");
        int d = scan.nextInt();
        System.out.println("enter num e");
        int e = scan.nextInt();
        int x = (a+b+c+d+e)/5;
        System.out.println("average of five number"+ "=" + x);
    }
}
