package ConditionalPrograms;
//Write a Java program that reads an integer and check whether it is negative, zero, or positive
import java.util.*;
public class Prog12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the integer");
        int n = scan.nextInt();
        if (n>0){
            System.out.println("the integer is positive");
        }else if (n<0){
            System.out.println("the integer is negative");
        }else {
            System.out.println("the integer is zero");
        }
    }
}
