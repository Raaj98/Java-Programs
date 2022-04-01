package ConditionalPrograms;
//Write a Java program to display the multiplication table of a given integer
import java.util.*;
public class Prog11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the terms");
        int n = scan.nextInt();
        for (int i=0;i<=n;i++){
            System.out.println(n + " x " + i + " = " + (n*i) );
        }
    }
}
