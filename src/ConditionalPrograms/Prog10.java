package ConditionalPrograms;
//display the odd natural number
import  java.util.*;
public class Prog10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the terms");
        int n = scan.nextInt();
        int sum = 0;
        System.out.println("the odd numbers are : ");
        for (int i=0;i<n;i++) {
            if (i % 2 == 1) {
                System.out.println(i);
                sum = sum + i;
            }
        }
            System.out.println("the sum of odd natural number is : " + sum);
    }
}
