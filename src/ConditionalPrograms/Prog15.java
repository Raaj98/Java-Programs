package ConditionalPrograms;
//Write a java program that accepts three numbers from the user and check if numbers are in “increasing” or “decreasing” order
import java.util.*;
public class Prog15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the num a");
        int a =scan.nextInt();
        System.out.println("enter the num b");
        int b =scan.nextInt();
        System.out.println("enter the num c");
        int c =scan.nextInt();
        if (a<b && b<c){
            System.out.println("the numbers are in increasing order");
        }else if (a>b && b>c){
            System.out.println("the numbers are in decreasing order");
        }else {
            System.out.println("none of the above");
        }
    }
}
