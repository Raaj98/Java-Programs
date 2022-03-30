package BasicPrograms;
import java.util.*;
public class Prog10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the numbers");
        int a = scan.nextInt();
        int n , sum = 0;
        while (a>0){
            n = a % 10;
            sum = sum + n;
            a = a / 10;
        }
        System.out.println("sum of digits :" + sum);
    }
}
