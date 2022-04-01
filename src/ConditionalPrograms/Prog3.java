package ConditionalPrograms;
//test number is positive or negative
import java.util.*;
public class Prog3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the number");
        int n = scan.nextInt();
        if (n>0){
            System.out.println("the number is positive");
        }
        else if (n<0){
            System.out.println("the number is negative");
        }else {
            System.out.println("the number is zero");
        }
    }
}
