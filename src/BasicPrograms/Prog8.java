package BasicPrograms;
//Write a Java program to convert a decimal number to binary numbers
import java.util.*;
public class Prog8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter binary number");
        String a = scan.nextLine();
        System.out.println("the decimal number");
        System.out.println(Integer.parseInt(a,2));
    }
}
