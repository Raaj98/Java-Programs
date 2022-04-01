package ConditionalPrograms;
//Write a Java program to take three numbers from the user and print the greatest number
import java.util.*;
public class Prog1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the num1");
        int num1 = scan.nextInt();
        System.out.println("enter the num2");
        int num2 = scan.nextInt();
        System.out.println("enter the num3");
        int num3 = scan.nextInt();
         if (num1>num2 && num1>num3){
             System.out.println("the largest number is :" + num1);
         }else if (num2>num1 && num2>num3){
             System.out.println("the largest number is :" + num2);
         }else if (num3>num1 && num3>num2){
             System.out.println("the largest number is :" + num3);
         }
    }
}
