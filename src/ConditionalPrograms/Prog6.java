package ConditionalPrograms;
//5 numbers to find their sum and avg
import java.util.*;
public class Prog6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the 5 numbers");
        int sum=0;
        for (int i = 0; i < 5; i++) {
            int num = scan.nextInt();
            sum = sum + num;
        }
        double avg = sum/5;
        System.out.println("the sum of 5 number is : " + sum);
        System.out.println("the avg of 5 number is : " + avg);
    }
}
